# AndroidAPS

* Check the wiki: https://androidaps.readthedocs.io
* Everyone who’s been looping with AndroidAPS needs to fill out the form after 3 days of looping  https://docs.google.com/forms/d/14KcMjlINPMJHVt28MDRupa4sz4DDIooI4SrW0P3HSN8/viewform?c=0&w=1

[![Gitter](https://badges.gitter.im/MilosKozak/AndroidAPS.svg)](https://gitter.im/MilosKozak/AndroidAPS?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Build status](https://travis-ci.org/nightscout/AndroidAPS.svg?branch=master)](https://travis-ci.org/nightscout/AndroidAPS)
[![Crowdin](https://d322cqt584bo4o.cloudfront.net/androidaps/localized.svg)](https://translations.androidaps.org/project/androidaps)
[![Documentation Status](https://readthedocs.org/projects/androidaps/badge/?version=latest)](https://androidaps.readthedocs.io/en/latest/?badge=latest)
[![codecov](https://codecov.io/gh/MilosKozak/AndroidAPS/branch/master/graph/badge.svg)](https://codecov.io/gh/MilosKozak/AndroidAPS)
dev: [![codecov](https://codecov.io/gh/MilosKozak/AndroidAPS/branch/dev/graph/badge.svg)](https://codecov.io/gh/MilosKozak/AndroidAPS)


![BTC](https://bitit.io/assets/coins/icon-btc-1e5a37bc0eb730ac83130d7aa859052bd4b53ac3f86f99966627801f7b0410be.svg) 3KawK8aQe48478s6fxJ8Ms6VTWkwjgr9f2

===================================================

UAM Tsunami by Michael Pinner

This README is valid for AAPS_2.8.2_UAM_tsunami_v1.0

How it works:
This version of UAM Tsunami introduces W-zero mode, but also supports "classic mode", where meals are announced by setting 'eating soon' temp targets.
The code relies on a situation dependent scaling algorithm. ISF values as defined in your local profile will be scaled in dependence of current bg (classic mode only), target bg, delta and scaling model parameters called scale_min, scale_max & scale_50.
The scaling curve is largely based on the Michaelis-Menten equation (MME) (see here: https://en.wikipedia.org/wiki/Michaelis%E2%80%93Menten_kinetics ). Briefly: Enzyme activity increases with the concentration of available substrates, until the activity is limited by the speed of the enzyme itself.
In diabetes, the most relevant enzymatic functions are carbohydrate digestion, glucose uptake into the bloodstream and glucose uptake into cells (e.g. by insulin). All of these activities become faster the more carbs in the digestive tract or glucose in the bloodstream are available, but slow down once the activity maximum of the respective enzyme is reached. The scaling equation used here takes this principle into account and adjusts ISFs aggressively initially, but slows down the larger delta becomes. The idea is to reduce the risk of hypos by overdosing if delta values are high.

Features of this approach are:

- Scaling parameters have a logical foundation / meaning
- The aggressiveness of the scaling curve can be fine-tuned and adjusted to ones personal needs. By using three scaling parameters, the minimum strength (base aggressiveness), intial steepness (local aggressiveness) and maximum strength (global aggressiveness) of the curve can be adjusted separately.
- The scaling equation works for all positive deltas - there is no risk of negative ISF values or unexpected behaviour
- The scaling equation works for all positive base ISFs
- The scaling equation follows a relative scaling approach. This means that if your insulin requirements change due to illness, physical inactivity etc., a profile switch may be all you have to do to get things going again. YDMV.
- The curve is self-limiting - even in situations of extreme sensor failure, ISFs won't go below the specified minimal ISF (ISF * scale_max/100).

-----------
W-ZERO MODE
-----------

W-zero handles meals automatically without further user input. However, for technical reasons it does not replace prebolusing. W-zero was introduced with version 1.0 and must be enabled in the SMB preferences. At this point, enabling data smoothing is a prerequisite for using W-zero, thus W-zero cannot be switched on if data smoothing is switched off.

## Theoretical background

W-zero scales profile ISF values in dependence of the current glucose curve development. Unannounced carbohydrates (and other BG influencing factors) lead to a rapid increase in blood glucose that the default oref1 algorithm will not stop in a timely manner. Larger insulin doses are required to cover a meal than oref1 provides using base ISF values. UAM Tsunami treats unannounced carbohydrates as "resistance units" and corrects for glucose spikes by lowering profile ISF values as if meals were acute episodes of insulin resistance. The default oref1 algorithm has limited UAM functionality and does not deliver enough insulin to cover a meal in due time. ISF scaling as used by UAM tsunami circumvents this issue, enabling the use of oref1 with unannounced meals. This approach comes with its own limitations, however, and although it has been used successfully for months, different strategies will be explored in the future.

## How it works

W-zero uses Michaelis-Menten equation based ISF scaling as introduced in earlier tsunami versions. However, several significant changes have been made for reasons of safety.

1 - General features

- Unlike in previous versions, scaling aggressiveness is independent of current BG. Increasing aggressiveness with increasing BGs may help stopping a rise quickly, but it comes at the cost of increased hypo risk. This risk is particularly pronounced in fully automated meal handling.

- Delta is still a central parameter for ISF scaling, but it no longer /directly/ influences base aggressiveness or the type of scaling equation used. In previous versions, high delta values switched on W1 functionalities outside user-set temp targets.

- Meals are no longer divided into separate waves (wave 1, wave 2..). Instead, every wave is treated the same (wave 0).

- Please have a look at my lame attempt of depicting a meal curve in ASCII below:

// asdga
// asdgasg


          .--.
         /    \
        /      \
     .-´        `-.


An ideal meal curve will feature:
* a flat line
* a sudden increase in curvature (acceleration / delta values increase)
* a linear climb (steadiness / delta values stay roughly the same)
* a decrease in curvature (deceleration / delta values becomes smaller)
* a peak
* ...and all of the above in reverse direction.

W-zero does not distinguish meal waves, but wave phases:
0.1 - curve acceleration
0.2 - steadiness
0.3 - curve deceleration.

Aggressiveness depends on the current wave phase and is generally highest during acceleration and decreases the closer the curve is to peaking.

- The glucose curve is analysed with every new reading by fitting 2nd degree polynomial functions to a predefined set of data points. A 2nd degree polynomial has the general shape of

f(x) = ax^2 + bx + c,

where x is the time in minutes (current reading = 0 min) and f(x) = BG at x. The coefficients (a/b/c) carry information about curve development and are key to evaluate how aggressively ISFs may be scaled.
Briefly: a = curvature; b = per minute delta; c = BG;

- W-zero does not require user action to be active. The most important conditions are that the current time lies within user specified hours, that delta & IOB are positive and that BG values are larger than 80 mg/dl. Whether or not SMBs will be delivered also depends on other factors for reasons of safety.

2 - Safety features

- Meal detection: For every new reading, the allowed aggressiveness will be calculated and stored in a variable called ‘mealscore’. Mealscore reflects the estimated likelihood that an observed rise is due to a meal and it influences aggressiveness of w-zero on multiple occasions. Albeit not the same, mealscore can be interpreted as a normalised variant of short-average delta. It is the weighted average of coefficient b of the most recent fits, normalised by a constant. The optimal value of this constant is subject to testing.

- Hypo mode: Peak glucose values are calculated with every new reading. If the last peak (or valley) value is below 85 mg/dl and if the current bg is below target * 1.1, w-zero will be deactivated. This feature aims to prevent falsely delivering SMBs in response to hypo carbs.

- Scaling parameter scaling: Ufser-set scaling parameters (scale_min/max, insulin required percent, boluscap (see below)) are no longer fixed constants but also subject to scaling, allowing full aggressiveness only when deemed safe and appropriate.

- Phase dependent aggressiveness: As described above, w-zero will act differently depending on the current state of the glucose curve. Actions are most aggressive during acceleration phase, become less aggressive during linear phase and reach minimum aggressiveness during deceleration phase.

- Data quality: W-zero will be inactive if not enough good quality data is available (e.g. after a sensor error or sensor swap). This prevents falsely delivering SMBs in case of sensor issues (see below for more details).

- SMB absorption time: UAM Tsunami uses a user-specified bolus cap (‘boluscap’) instead of UAM basal minutes. Rapid glucose climbs could lead to delivery of max-sized SMBs with every new reading, while each dose of insulin requires at least 15-20 minutes to become visible in sensor data. This lag time can lead to severe overdosing. To solve this problem, boluscap is now a dynamically adjusted variable that will become smaller if the last SMB or user bolus was 70% or more of the user-specified boluscap value. If the conditions are met, boluscap will be adjusted in the following way:

profile.boluscap – lastSMB = new_boluscap.

Example: If the user-specified cap is 1 U and 1 U was delivered 5 min ago, the cap will be adjusted to

1 - 1 = 0 U.

If the last SMB, however, was 0.7 U, the current boluscap will be

1 - 0.7 = 0.3 U.

By limiting the frequency of large SMBs, your body will have more time to absorb insulin, thereby lowering the risk of overdosing.

3 - Other features / what else is new in tsunami v1.0:

- Complete rewrite of the data smoothing algorithm. Previous versions did not check for data coherence and thus falsely calculated delta values from readings before and after sensor errors. This could trigger SMBs and was fixed in this version. The available set of glucose readings is checked for validity, and only valid data is used for data smoothing. As a result, following sensor errors / swap or other issues, original sensor data will be used until enough valid data is available for smoothing. A minor bug in the original smoothing code was also found/fixed in the process.

- Glucose curve analysis features were added for w-zero.

- The workings of W-zero can be tracked in the SMB debug console. W-ZERO STATUS will list the most important variables to understand what is happening, and why.

- Boluscap is now affected by profile switch percentages. If you increase/decrease your profile percentage, the same percentage will apply also to boluscap. This improves performance during insulin resistance and safety during episodes of increased insulin sensitivity.

- AAPS-2.8.2 sensitivity based target adjustment has been restored. However, if w-zero is currently active and detects curve acceleration or deceleration, the target bg will be adjusted using the user specified target adjustment factor, temporarily overwriting the sensitivity adjusted target. This allows for situation dependent target adjustment during meals as well as insulin sensitivity dependent adjustment outside meals (default AAPS code). The modded version by MT will not be used if w-zero is enabled.

- Tsunami v1.0 still contains TT based UAM functionality (classic mode). Classic mode is used if w-zero is disabled in the settings. Classic mode will be removed in future releases and is mostly still available in case of unexpected critical errors in the w-zero code, to allow for conveniently switching back to the tried-and-tested code. Classic mode works largely like tsunami v0.7 and does not use AAPS-2.8.2 sensitivity based target adjustment. Instead, the modded version by MT is used at all times (as in v0.7).
Please note that this means that setting eating-soon temp targets will still deliver automatic preboluses, even if w-zero is enabled. TT-linked preboluses will also be removed in future releases.

## General remarks

Automatic meal handling is a challenging task that requires a fine balance between delivering enough insulin rapidly to halt a rise, and dosing insulin carefully to avoid hypoglycaemia. The risks are mitigated by a number of safety features, but highs and lows will still occur. In comparison to tsunami v0.7, glucose values may be longer and more frequently between 160-200 mg/dl. This is because large SMBs will not be sent immediately as glucose starts to rise. In my personal tests (about 1 month at the point of writing), this reduces the occurrence of post-prandial hypoglycaemia caused by residual insulin hours after a meal. The height of prandial peaks can be kept below 200 mg/dl by manually delivering appropriately sized preboluses. I have not tested w-zero without prebolusing for meals, and I would generally not recommend it given the expectedly better outcome with prebolusing. The size of the prebolus depends on the type of meal and you should bolus based on your personal experience. There is no one-size-fits-all here, but in general the purpose of the prebolus is to get active insulin into your system before your sensor registers a meal and w-zero kicks in. Glucose absorption + sensor lag time + insulin absorption all play against us, and the prebolus buys AAPS_tsunami enough time to take over before glucose values get too high.

If you find that the algorithm is too weak or too strong, the code may need improving. However, the UAM tsunami versions are controlled by an array of user settable variables, and you should first try to get the system running as desired by tuning your settings. The following settings can be used to fine tune w-zero:

- insulinReq delivery percentage: The higher this setting, the sooner you will run into your boluscap setting. The lower this setting, the longer it takes to run into your cap. Oref1 tries to predict how much insulin you need to come back to target. This variable determines how much of this calculated value may be delivered each iteration.

- scale_min: Scale_min is only used during curve acceleration and steadiness. In both cases, scale_min is scaled with mealscore. During linearity, scale_min will additionally scale with coefficient b (“delta”). Scale_min will never be smaller than your setting.

- scale_50: Represents the delta value at which 50% of scaling power will be reached. The lower this value, the /sooner/ you will run into your boluscap. In this repository you will find an excel sheet where you can see how scale_min affects the scaling curve.

- scale_max: Lowest percentage of your profile ISF that can be scaled towards. Your ISF cannot be lower than scale_max/100 * profile_ISF. The lower this value, the more aggressive the scaling will be and the sooner you will run into your boluscap. Be careful, small changes (e.g. from 30 to 25) will have a larger impact than you may think. During curve deceleration, scale_max will be set to 120% of its original value, thereby decreasing aggressiveness.

- UAM bolus cap: Self-explanatory. :) Indicates the largest SMB deliverable by W-zero, thus large values will decrease your time above range, at the cost of increased hypo risk.

- Dynamic target adjustment factor: The larger this value, the further apart your target will be during curve acceleration and deceleration. New target = target_bg / or * adjustment factor.

W-zero does not use ‘ev.BG threshold for delivery of >100% insulinReq.’, W2 modifier of scale_50, W2 IOB threshold, UAM prebolus and deceleration scaling (a more sophisticated version of this feature is one of the central components of w-zero). All of these settings are here for legacy reasons and will be removed soon.

Feel free to experiment and please share what works/doesn’t work. Settings that worked with tsunami v0.7 still worked for me with w-zero. I only increased scale_50 from 4 to 5. If your scale_50 is very low, please be extra careful and ready to set it higher if you experience frequent lows.
Whatever you do: Please never adjust your profile (basals, ISF) to improve outcomes with modded AAPS versions. Only adjust them if you believe that your actual insulin requirements have changed and/or after valid tests, not because the UAM algorithm works better with faked profile parameters. Code that requires you to lie about your insulin requirements is code that needs improving.

For your reference, these are my w-zero settings:

insulinReq delivery percentage [%]: 70
scale_min [%]: 70
scale_50 [%]: 5
scale_max [%]: 25
W-zero start/end times: 9/23 (these are personal preferences though)
UAM bolus cap [U]: 0.8 (on Lyumjev U200, so 1.6 on U100)
Use autosens feature
Use autoisf feature
Enable data smoothing
Enable W-zero
How frequently SMBs will be given in min: 1
Dynamic target adjustment factor: 1.2

Absorption settings  advanced settings
Max autoisf ratio: 2.5
Autoisf hourly increment: 0.25

Thanks a lot for helping me improve this algorithm. :) Please let me know if you find bugs, have questions or suggestions!

------------------------------------------------------------
CLASSIC MODE (OUTDDATED, will be removed in future versions)
------------------------------------------------------------

UAM_tsunami uses a three-layered approach, consisting of meal handling (or wave 1 (W1)), post-prandial spike handling (or wave 2 (W2)) and handling of presistent highs (auto ISF).
W1: Manually activated by the user by setting a TT of <90, and only active during this TT.
W2: Enabled only during user specified hours and if an array of safety conditions are met (namely a delta of at least 4 mg/dl/5 min, a minimum IOB value specified by the user and a minimum bg of 100 mg/dL).
AutoISF: Code by gazelle (github). Scales ISF if W1 and W2 are inactive and aims to break through persistent highs.

The code follows the above outlined sequence: W1 --> W2 --> autoISF

W1 scaling is depending strongly on delta and, to a slightly lesser extent, the ratio of current bg versus target bg.
W2 scaling uses the same math as W1, but additionally, scale_50 (see below) is weakened by W2 modifier (also described below). If delta is above 8 mg/dl/5 min, the same math as in W1 will be used instead. Unlike W1, W2 is designed to be active during waking hours (i.e. all day), so for additional safety, data smoothing (see below) can be used. Data smoothing is not available for W1 or autoISF at this point.
autoISF uses a different, generally weaker algorithm and is always managing BGs when W1 or W2 are not. It is a safety-net and generally by itself not strong enough to handle unnaounced meals.

Before use, the following parameters need to be set in the OpenAPS SMB preferences (note that some variables used in MTs UAM-1.6.1 have been removed, modified or given entirely new functionality):

- Maximum total IOB OpenAPS can't go over: Standard AAPS setting, which has been linked to UAM functions. Other variables depend on this value, so make sure to set a reasonable maxIOB to avoid overdosing. (see W2 IOB threshold)
- insulinReq delivery percentage: The specified percentage of the calculated required insulin will be delivered. NOTE: Unlike in previous versions, an actual percentage (not a fraction of 1) is required here!
- ev.BG threshold for delivery of >100% insulinReq.: BG prediction above which more than 100% of the calculated required insulin may be delivered.

General ISF scaling parameters
- scale_min: W1 mode only. Lowers the base ISF to the specified percentage. Keeping it at 100% means that at a delta of 0, your base ISF will remain unchanged. If you lower it to 70%, even at a delta of 0, your ISF would be reduced to 70% of its original value.
- scale_50: Delta value at which the halfway point of the scaling window is reached (ISF exactly between the ISFs specified by scale_min and scale_max). Scale_50 represents the local aggressiveness or initial steepness of the curve. The smaller this value, the larger the change in ISF from small deltas will be. The larger this value, the less small fluctuations in delta will impact ISF scaling. (You can simulate the scaling using the provided excel sheet)
- scale_max: Percentage of ISF which represents the minimum ISF value to scale towards. While your ISF (or scale_min ISF) represents the top end of the scaling range, the ISF resulting from scale_max represents the bottom end (100% scaling). Example: If your base ISF is 50 mg/dl/U and your scale_max is 20%, the minimum ISF that will be scaled towards is 50 * 20/100 = 10 mg/dl/U. scale_max represents the global aggressiveness of the curve. Mathematically, this ISF can only be approximated but will never be reached, or in other words: The curve is self-limiting.

W2 functionality
- W2_modifier of scale_50: Multiplier of scale_50 used during 2nd wave assist (outside TT). It weakens scale_50 to shift aggressiveness of the scaling curve towards larger deltas and is therefore a safety feature.
- W2 IOB threshold: Percentage of maxIOB below which W2 assist will be disabled. This parameter is a safety feature.
- W2 assist start time: Hour of the day from when on (and including) W2 assist (OUTSIDE TTs) may be used given a number of other conditions are met. The time limitation reduces the risk of overdosing through e.g. compression lows at night.
- W2 assist end time: Hour of the day until (and including) W2 assist (OUTSIDE TTs) may be used if certain conditions are met.
- Enable data smoothing: Sensor data will be smoothed using a weighted combination of 1st and 2nd order exponential data smoothing functions. The tsunami ISF scaling code heavily relies on good quality data, and a noisy sensor can result in a high risk of hypoglycaemia. Data smoothing means that sudden glucose jumps will be weakened before being used by the scaling algorithm. This increases safety, but may also result in weaker initial responses. By using 1st and 2nd order smoothing functions, this initial lag time can be kept relatively short. Data smoothing in v0.6.1 is currently only implemented into W2 functionality as W1 mode is activated manually before a meal.

Other UAM settings
- UAM prebolus: Automatic prebolus delivered upon starting a TT below 90 mg/dl and a minimum duration of 60 min.
- UAM bolus cap: SMBs triggered by W1 and W2 assists wil be limited by the quantity stated here. Basal minutes are NOT used by W1 and W2!
- Deceleration scaling: If a change in glucose trend is detected, scale_max is raised to decrease scaling aggressiveness. Smoothed delta values from now and 5 min ago are compared, and if deltas are detected to become smaller, scale_max will be dynamically adjusted depending on the how large the difference between both delta values is. The larger the difference, the higher scale_max will be. scale_max will never be larger than your base ISF (or if you are using scale_min for W1, scale_max will never be larger than your base ISF * scale_min). Deceleration scaling may reduce the risk of hypoglycaemia, but at the same time decreased aggressiveness could increase your post-prandial glucose levels. You may need to readjust your scaling parameters! Deceleration scaling was introduced in v0.7 and requires testing.
- Dynamic target adjustment factor: Up to tsunami_v0.6.1, dynamic target adjustments (if activated) were based on autosens_max. From tsunami_v0.7 onwards, target adjustments and autosens are using separate factors. In case of a predicted low, your base target will be multiplied by this factor, in case of a predicted high, your base target will be divided by this factor. Example: If your target is 100 and your adjustment factor is 1.25, in case of a low, your target will be adjusetd to 100*1.25 = 125 mg/dl; in case of a high, it will be adjusted to 100/1.25 = 80 mg/dl; If you set the factor to 1, your target will remain unchanged, thus functionally disabling this feature.