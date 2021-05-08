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

AAPS 2.8.2-UAM_tsunami was based on 2.8.2-UAM-1.6.1 by Mathieu Tellier and modified from there. This code differs significantly from the original and requires different/new settings.

How it works:
The code relies on a situation dependent scaling algorithm. Meals must be "announced" by setting a TT between 80-85 mg/dl, which also triggers a prebolus of user-defined size if TT duration is 30 min or longer.
As long as the TT is running, ISF values as defined in your local profile will be scaled in dependence of current bg, target bg, delta and two scaling model parameters called scale_max & scale_50.
The scaling curve is largely based on the Michaelis-Menten equation (MME) (see here: https://en.wikipedia.org/wiki/Michaelis%E2%80%93Menten_kinetics ). Briefly: Enzyme activity increases with the concentration of available substrates, until the activity is limited by the speed of the enzyme itself.
In diabetes, the most relevant enzymatic functions are carbohydrate digestion, glucose uptake into the bloodstream and glucose uptake into cells (e.g. by insulin). All of these activities become faster the more carbs in the digestive tract or glucose in the bloodstream are available, but slow down once the activity maximum of the respective enzyme is reached. The scaling equation used here takes this principle into account and adjusts ISFs aggressively initially, but slows down the larger delta becomes. The idea is to reduce the risk of hypos by overdosing if delta values are high.

Features of this approach are:

- More intuitive setting of parameters as scaling parameters have a logical foundation / meaning
- The aggressiveness of the scaling curve can be fine-tuned and adjusted to ones personal needs. By using two scaling parameters, the intial steepness (local aggressiveness) and maximum strength (global aggressiveness) of the curve can be adjusted separately.
- The scaling equation works for all positive deltas - there is no risk of negative ISF values or unexpected behaviour
- The scaling equation works for all positive base ISFs
- The scaling equation follows a relative scaling approach. This means that if your insulin requirements change due to illness, physical inactivity etc., a profile switch may be all you have to do to get things going again. YDMV.
- The curve is self-limiting - even in situations of extreme sensor failure, ISFs won't go below ISF/(scale_max + 1).

Before use, the following parameters need to be set in the OpenAPS SMB preferences (note that some variables used in MTs UAM-1.6.1 have slightly changed functions and consequences here):

- Meal factor start time: Hour of the day from when on MME scaling OUTSIDE TTs may be used if certain conditions are met. The time limitation reduces the risk of overdosing through e.g. compression lows at night.
- Meal factor end time: Hour of the day until (and including) when MME scaling OUTSIDE TTs may be used if certain conditions are met.
- UAM PreBolus normal meal: Automatic prebolus delivered upon starting a TT between 80-85 mg/dl and a minimum duration of 30 min.
- scale_max: Percentage of ISF which represents the minimum ISF value to scale towards. While your ISF represents the top end of the scaling range (0% scaling), the ISF resulting from scale_max represents the bottom end (100% scaling). Example: If your base ISF is 50 mg/dl/U and your scale_max is 0.2, the minimum ISF that will be scaled towards is 50 * 0.2 = 10 mg/dl/U. scale_max represents the global aggressiveness of the curve.
- scale_50: Delta value at which 50% of the ISF defined by scale_max is reached. Example: If your base ISF is 50 mg/dl/U, your scale_max is 0.2 and your scale_50 is 4 mg/dl/5min, then your ISF at a delta of +4 mg/dl/5min will be: 50 - ((50 - (0.2 * 50))/2) = 30 mg/dl/U. Scale_50 represents the local aggressiveness or initial steepness of the curve. The smaller this value, the larger the change in ISF from small deltas will be. The larger this value, the less small fluctuations in delta will impact ISF scaling.
- W2_modifier: Multiplier of scale_50 used during 2nd wave assist (outside TT). It weakens scale_50 to shift aggressiveness of the scaling curve towards larger deltas.