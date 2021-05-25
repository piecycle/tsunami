# AndroidAPS

* Check the wiki: https://androidaps.readthedocs.io
*  Everyone who’s been looping with AndroidAPS needs to fill out the form after 3 days of looping  https://docs.google.com/forms/d/14KcMjlINPMJHVt28MDRupa4sz4DDIooI4SrW0P3HSN8/viewform?c=0&w=1

[![Gitter](https://badges.gitter.im/MilosKozak/AndroidAPS.svg)](https://gitter.im/MilosKozak/AndroidAPS?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Build status](https://travis-ci.org/nightscout/AndroidAPS.svg?branch=master)](https://travis-ci.org/nightscout/AndroidAPS)
[![Crowdin](https://d322cqt584bo4o.cloudfront.net/androidaps/localized.svg)](https://translations.androidaps.org/project/androidaps)
[![Documentation Status](https://readthedocs.org/projects/androidaps/badge/?version=latest)](https://androidaps.readthedocs.io/en/latest/?badge=latest)
[![codecov](https://codecov.io/gh/MilosKozak/AndroidAPS/branch/master/graph/badge.svg)](https://codecov.io/gh/MilosKozak/AndroidAPS)
dev: [![codecov](https://codecov.io/gh/MilosKozak/AndroidAPS/branch/dev/graph/badge.svg)](https://codecov.io/gh/MilosKozak/AndroidAPS)


![BTC](https://bitit.io/assets/coins/icon-btc-1e5a37bc0eb730ac83130d7aa859052bd4b53ac3f86f99966627801f7b0410be.svg) 3KawK8aQe48478s6fxJ8Ms6VTWkwjgr9f2

===================================================
This version of AAPS was modified to work in full closed loop, exclusively UAM mode during the meal, no carbs entry, no bolus. 
This is not for beginners.
Keep sugar in your pocket. :)

This README is valid for AAPS_2.8.2_UAM_tsunami_v0.7

AAPS 2.8.2-UAM_tsunami was based on 2.8.2-UAM-1.6.1 by Mathieu Tellier and modified from there. This code differs significantly from the original and requires different/new settings.

How it works:
The code relies on a situation dependent scaling algorithm. Meals must be "announced" by setting a TT between 80-85 mg/dl, which also triggers a prebolus of user-defined size if TT duration is 30 min or longer.
As long as the TT is running, ISF values as defined in your local profile will be scaled in dependence of current bg, target bg, delta and two scaling model parameters called scale_max & scale_50.
The scaling curve is largely based on the Michaelis-Menten equation (MME) (see here: https://en.wikipedia.org/wiki/Michaelis%E2%80%93Menten_kinetics ). Briefly: Enzyme activity increases with the concentration of available substrates, until the activity is limited by the speed of the enzyme itself.
In diabetes, the most relevant enzymatic functions are carbohydrate digestion, glucose uptake into the bloodstream and glucose uptake into cells (e.g. by insulin). All of these activities become faster the more carbs in the digestive tract or glucose in the bloodstream are available, but slow down once the activity maximum of the respective enzyme is reached. The scaling equation used here takes this principle into account and adjusts ISFs aggressively initially, but slows down the larger delta becomes. The idea is to reduce the risk of hypos by overdosing if delta values are high.

Features of this approach are:

- More intuitive setting of parameters as scaling parameters have a logical foundation / meaning
- The aggressiveness of the scaling curve can be fine-tuned and adjusted to ones personal needs. By using three scaling parameters, the minimum strength (base aggressiveness), intial steepness (local aggressiveness) and maximum strength (global aggressiveness) of the curve can be adjusted separately.
- The scaling equation works for all positive deltas - there is no risk of negative ISF values or unexpected behaviour
- The scaling equation works for all positive base ISFs
- The scaling equation follows a relative scaling approach. This means that if your insulin requirements change due to illness, physical inactivity etc., a profile switch may be all you have to do to get things going again. YDMV.
- The curve is self-limiting - even in situations of extreme sensor failure, ISFs won't go below the specified minimal ISF (ISF * scale_max/100).

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