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
This is not for beginner user.
Keep sugar in your pocket :)

In the 2.8.2-UAM-1.6, you can run with a temp target (button are style there) or without temp target.
Settings are simple :
- Prebolus normal meal, is available in the settings, UAM_Pbolus1, that will send a prebolus when a temptarget is set, target lesser than 90 and duration more than 29 minutes, at 00 minute running.
that means, with small meal button it can send a prebolus.
- UAM_ISF1 is available in the settings. That will divide by the value the ISF if a temptarget is set between 80 and 85 value target and for more than 29 minutes. That means with the small meal button, isf will be divide by 3.
- % of Insulin required is available in the settings too, by default the value is 0.65, means 65 % of the insulin required for one smb will be send. Since two weeks of test, i'm using it with 0.75 value.
- In this version, the prediction curve is not dynamic, to avoid overdosing insulin when the prediction is shorter IOB Prediction is blind. The prediction is running on 3 hours.
In the code :
- To avoid during the temp target duration, a static ISF with a big rise, ISF will be divide by 3, less the value of the delat.
- ISF will change faster :
    - between 7am and 22pm, if rise is comming with delat > 10 and BG > 100, isf will change right away, isf - delta, without temp target set.
    - between 11am and 15pm, if rise is comming with delta >18 and BG > 140, isf will change right away, (isf - delta)/2, without temp target set.
    - Between 19pm and 22pm, if rise is comming with delta >18 and BG > 140, isf will change right away, (isf - delta)/2, without temp target set.
    - if bg < 100 and delta < -5, isf in the profile * 2.
- % of insulin required will change for 130% if eventualBG > 180. That will happen only if eventualBG exist and is greatter than 180. In my test, this allow one SMB during the rise around 2.30 value.

Profile used during the test :
- DIA : 7
- IC : 5.5
- ISF : 70
- Basal : 1
- Target :
    - 00:00/12:00 110-110
    - 12:00/24:00 99

Default settings i used :
- Maximum ration autosens : 2
- Minimum ration autosens : 0.3
- Max Autoisf ratio : 3
- autoisf hourly increment : 0.8
- Max. minutes basal smb : 200
- Max. minutes basal smb UAM : 200

In my scenario test :
- For a meal between 40 and 50 carbs, out of breakfast (lunch and dinner), i did nothing, the script manage it without hypoglycemia.
- For a meal between 50 and 65 carbs, out of breakfast, if i didn't use a TT, the end of the rise will be around 180 instead of 160 with a TT.
- For a meal, more than 80 carbs, i used a TT, first wave end at 150, second wave 2 hours later run at 180, and come back in the target range.

Run your own scenario test, you can use the button or not, i recommand you to use button if the meal is a big one, specialy if you use a target > 90.
========================================================================
version 2.8.2-UAM-1.6.1
move prebolus section in temptargetdialog, thanks to Andreas. Prebolus normal will come with small meal and the others button.
ISF management change a litlle bit, more efficient in my test.
variable available in this version :
inisulinreq
prebolus
Meal factor start time
Meal factor end time
i added a line console.log about ISF change, but last section keep the real value everytime, or loop debug page.


