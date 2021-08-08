**UAM Tsunami by Michael Pinner**

This README is valid for AAPS_2.8.2_UAM_tsunami_v2.0

_Tsunami v2.0 is a modified variant of AndroidAPS v2.8.2 with added capabilities to automatically handle unannounced meals (UAM). This algorithm is highly experimental – use it at your own risk! Do not use it on children!_

## Introduction
Tsunami v2.0 is the third iteration of this project, and it comes with some of the largest changes so far. Please read this README carefully so you understand how this algorithm works – for your own safety.

### History of the project

#### Tsunami v0.#
The first versions (v0.#, including the spin-off project AIMI-Tsunami) used the Michaelis-Menten equation to scale down user-set ISF values during meals in dependence of delta values. This approach was necessary to use the oref1 algorithm also for UAM. Originally, oref1 was designed to work with announced carbohydrates and thus the standard version of AAPS is too weak when it is confronted with unannounced carbs, resulting in unacceptably high glucose values.

Tsunami v0 separated meals into individual waves: A first spike at the beginning of a meal, and weaker second wave a bit after a meal. Because of this the settings for wave 1 were generally more aggressive, but for reasons of safety had to be turned on manually by setting an eating-soon temp target (TT). In contrast, wave 2 mode did not require manual user input as it was active when no TT was set. Although this approach worked reasonably well, the Michaelis-Menten approach requires the user to set a number of scaling and safety parameters to tune aggressiveness. This was confusing to some and regularly resulted in people copying other people’s settings without truly understanding what each parameter actually does. A second problem was that users had to choose the optimal TT duration for each meal, as too long or too short durations could end with in undesired results. Because of this the earliest versions were only a minor improvement over classic carb announcement. Development efforts began to focus on TT free forms of UAM. In fact, even though second phase meal handling was weaker, it turned out to still handle UAM reasonably well. Perpetual wave 2 mode was explored further by the AIMI-Tsunami variant.

#### Tsunami v1.0 / 1.0.1
Mainline Tsunami followed a different approach than AIMI-Tsunami, however, as new mechanisms for glucose curve analysis were introduced. Instead of differentiating between individual meal waves, each wave itself was now split up into three phases: acceleration phase, linear phase, deceleration phase. It no longer mattered if a rise occurred at the beginning of a meal or later. All that mattered was the current state of the glucose curve. This approach worked well and allowed safe meal handling without the need of manual user input, but some of the problems already known from v0.# were inherited by tsunami v1.0. Ultimately, these issues triggered the development of version 2.0.

### The problems of older Tsunami versions & ISF scaling in general

#### 1 - Scaling parameters & the scaling approach
The tunability of Michaelis-Menten based ISF scaling turned out to be an advantage and disadvantage at the same time. While aggressiveness could be fine-tuned using a set of three scaling parameters, these settings had to be guessed. Some people resorted to adopting the settings of other users without understanding the meaning of the individual parameters. As a consequence, it was not always clear to every user which setting they needed to adjust for improved result. This situation can be potentially dangerous and calls for a simpler, more user friendly UAM code.

#### 2 - The illusion of glucose targets
Set Glucose targets and TTs never really mattered. Oref1 will correct for high glucose values by dividing the difference of current bg and target bg by ISF values. Meals, however, require larger insulin quantities than pure bg corrections. For this reason, ISF scaling is needed to trick oref1 into believing that the already delivered insulin is not enough to bring the current bg down to target. A consequence of this is that insulin requirements calculated using the correction equation are little more than guesses or random values. This renders target bg targets to mild but inconvenient means of further tuning aggressiveness of the code. Importantly though, one has to give up the idea that ISF scaling approaches will bring the glucose curve down to a specific target value.

#### 3 - The problem of glucose prediction models & oref1
Oref1 relies heavily on its glucose predictions to judge whether or not it is safe to deliver an SMB. In UAM mode, these predictions are inevitably very crude if not plain false. This problem is made more complex by ISF scaling approaches, which fake lower than normal ISF values and therefore also affect the prediction models. On the other hand, this is part of the reason why ISF scaling approaches work in the first place: It changes the prediction curves such that oref1 is willing to send SMBs in situations where it otherwise would predict low glucose events. ISF scaling was implemented to confer UAM capabilities to oref1, but oref1 was designed to work with carb announcements. This means that ISF scaling forces oref1 to do a job it wasn’t designed for.

#### 4 - Same delta values are not always the same
As will be discussed later, the same reported sensor value (e.g. 5) do not always mean the same thing. This was ignored in previous Tsunami versions, but is at the core of Tsunami v2.0.

#### 5 - Same IOB values do not always have the same implications
IOB is all the majority of loopers talk about, but there’s a lot more to consider. IOB values are suboptimal for UAM purposes, but they were the main insulin variable used in older Tsunami versions. It does make a difference whether IOB is 1 because you just injected 1 U, or if it is 1 because you have injected 3 U 1.5 h ago. Tsunami v2.0 takes this into account.

## Tsunami v2.0
The latest version of UAM tsunami uses an entirely new UAM engine. No base variables are scaled, only the profile ISF values are used. AAPS knows two kinds of insulin variables: IOB and activity. Whereas IOB is the predicted amount of unused insulin in the body, insulin activity is the predicted quantity of insulin active right now. In mathematical terms: IOB is the integral of the insulin activity curve from now until DIA (duration of insulin activity). Directly after a bolus of 1 U, IOB will be 1 U and insulin activity will be 0 U. As time progresses, IOB will continuously go down, while insulin activity will go up until it reaches its peak, and then drop again. The insulin plugin of AAPS illustrates this nicely in graphs.
For UAM purposes where the quantity of carbohydrates consumed is unknown, it is important to halt a glucose climb as soon as possible. As becomes clear from the explanation above, it is not IOB that matters, but insulin activity. IOB carries no information about insulin absorption. At a DIA of 6 h and a peak time for 40 min, takes about 90 minutes for a bolus of 3 U to decay to 1 U. Over the next hour, this remaining IOB of 1 U from will lower bg much faster than a 1 U bolus in the same time. This is important to consider particularly if glucose levels are rising, e.g. due to second or third meal waves. A delta of +10 mg/dl/5 min at 0 insulin activity describes a much slower rise than a delta of +10 mg/dl/5 min at an activity of 0.1 U/5min. As an example, if your ISF is 50 mg/dl/U, the corrected delta values would be:
+10 at 0 activity = +10 (unchanged);
+10 at 0.01 activity = +15 (+50% over reported sensor delta);
The active insulin compensates some of the raise, resulting in a lower measured delta. This, by the way, is also the mechanism behind perceived “insulin resistance” at persistent highs. You are not resistant to insulin; you are just compensating for glucose rises.
Tsunami v2.0 aims to replace the ISF scaling based UAM engine by an insulin activity based one. To make this work, oref1’s glucose prediction models are not used. As was outlined above, these prediction models are unreliable and often times false. Furthermore, the SMB sizing equation used by oref1 is not suitable for UAM purposes as there is no way to predict the required amount of insulin to bring bg back to target if the amount of carbs consumed is unknown. Finally, target glucose values have no meaning in ISF scaling approaches in particular, and UAM mode in general. Tsunami v2.0’s activity engine does not have the goal to bring bg back to target. Instead, it aims to bring glucose climbs to a halt in a timely manner (i.e. turn a positive delta into a zero delta). In more detail: The algorithm will calculate the amount of insulin required to bring the current, activity corrected delta value to 0 in “peak time” minutes, assuming that delta will remain constant. In reality, delta values change, and as insulin activity does not stop after peaking, glucose values will still eventually end up close to the specified target value.

### Tsunami activity engine modes
TAE has two modes: Near-constant activity mode & activity build-up mode. Activity-build up mode is the main mode active during a meal when your glucose values are rising fast. TAE will attempt to build up insulin activity quickly to halt the climb. When this is the case and delta values are between +0-4 mg/dl/5min, the risk of overdosing is relatively large – particularly hours after a meal. This is when near-constant activity mode kicks in. The aim of it is to keep activity levels at 75% of the current activity, resulting in a slower than normal decay of IOB. Ideally, this will weaken or prevent postprandial glucose spikes (“second waves”) which carry the risk of overdosing. Ideally, near-constant activity mode will keep your glucose constant while your body is still digesting your last meal until insulin activity is larger than carb activity and your glucose begins to drop.

### How to use
Make sure your profile is correct. The better your profile, the better the results. The algorithm relies on correct basal and ISF profiles. If you have knowingly faked your ISF values for previous UAM mods, please correct them. Aside from basals and ISF, good DIA and insulin peak time settings are of great importance. PLEASE CHANGE YOUR INSULIN PRESET TO FREE-PEAK OREF! You can manually set the peak-time there, so if you are using one of the other presents (e.g. Ultra-Rapid oref or Lyumjev), you can copy the peak-time of your current preset into free-peak oref. Tsunami 2.0 takes the peak-time set in free-peak oref as target time for its calculations. If you find that something about your insulin kinetics has changed, please be ready to adjust your DIA and peak-time settings. For optimal results, the activity model curve should be as accurate as possible. It is also recommended to switch on the activity graph in the BG graph on the main screen. Often times, the glucose curve – at least in parts – follows the activity curve. Monitoring your insulin activity curve will help you understand what TAE is doing.

### A note about prebolusing
Preboluses have the aim to build up insulin activity before the sensor has registered a rise. As this issue is one an algorithm cannot solve, prebolusing is recommended for every meal. Leaving out the prebolus will result in higher than necessary glucose spikes. Every user must decide for themselves if such spikes are acceptable or not. Attempts to make up for missed preboluses by injecting very large SMBs come at an increased risk of overdosing and could in some situations cause severe episodes of hypoglycemia. For safety reasons, no code aiming to replace prebolusing is included in Tsunami v2.0. For the same reason, the size of the bolus cap setting should be chosen with care.

### Limitations
Small snacks with a high glycemic index (sweets, glucose tabs etc.) will result in sudden and very high rises that will end as quickly as they began. Several safety mechanisms are in place to reduce the risk of hypoglycemia, particularly if bg is in the low 100 mg/dl range. However, small amounts of high-GI foods could potentially cause overdosing. This risk can be reduced by prebolusing. Alternatively, you can switch of TAE, either by switching it off in the settings, by setting a high TT with the SMB with high temp pargets setting enabled or by logging the carbs consumed (COB disables TAE).
In general, UAM plugins cannot avoid hypos and hypers altogether. Sometimes your curve will be perfect, other times you will find going up to values of up to 200 mg/dl. There are many possibilities for this, including issues with your pump sites (tunnelling?), sensor issues (delayed responses & noisy data), insulin issues (the faster the insulin, the better the results), changes in your sensitivity (sickness / sports) and so on. Many things can go wrong in diabetes. In case of problems, make sure that you are not experiencing any of the issues listed above. If you are sure that none of these issues apply to you, you may have found a bug or shortcoming of the code. In this case, please report the bug to me.

### Bug reports
If you think you have found a bug, please let me know by describing the situation. The script debug section in the SMB tab contains a tsunami status part – please take a screenshot of it. At the bottom of the script debug section, you may also find a checkpoint code – please also take a screenshot of that.

### Tsunami activity engine in bullet points:
- TAE has two modes: Constant-activity mode & activity build-up mode.
- TAE will only handle glucose rises and let oref1 take over if delta is negative.
- TAE calculates insulin required itself.
- Oref1 will take care of temp basal management (zero temping).
- Oref1 will adjust insulin requirements as calculated by TAE such that it respects max IOB, boluscap and your pump’s minimal step size.
- TAE does not use Oref1’s glucose predictions.
- The role of glucose targets is mainly that of safety thresholds. TAE is inactive is bg is below your target. Target values are also used for mealscore calculations in constant activity mode.
- TAE assumes that the insulin activity from 10 minutes ago is the activity that matches the current delta reading taking sensor lag into account.
- TAE is virtually settings-free. The 4 remaining settings give you control over your own safety:
   - Boluscap – the maximum SMB size that may be given at a time
   - Insulin delivery percentage – percentage of calculated insulin requirement to deliver as an SMB. Other constraints still apply (maxIOB, boluscap).
   - TAE start/end times: Time window within which TAE is active.
- If switched on in the settings, autoISF can be used - but only outside TAE hours, e.g. for assistance with large meals at night.

## Change log
- Removed Tsunami classic mode (v0.#)
- Removed w-zero mode (v1.0 / v1.0.1)
- Removed additional meal TT buttons
- Removed automatic prebolus when eating-soon TT is set (full restoration of AAPS master behaviour)
- Removed w-zero target adjustment (full restoration of AAPS master autosens target adjustment)
- Added Tsunami Activity Engine (TAE)
- Code clean up
