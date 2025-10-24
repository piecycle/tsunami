This document specify hints and good practices for source code contributions.

AndroidAPS is community effort and all contributions are welcome! If you wish help us improving AAPS - please read and try to adhere to 
this guidelines, to make the development and process of change approval as smooth as possible :) 

General rules
=============

* There are plenty of ways you can help, some of them are listed on wiki:
  https://wiki.aaps.app/en/latest/SupportingAaps/HowCanIHelp.html
* If you wish to help with documentation or translating:
  https://wiki.aaps.app/en/latest/SupportingAaps/Translations.html
  
Development guidelines
======================

Coding conventions
-----------------
1. Use Android Studio with default indents (4 chars, use spaces)
2. Use autoformat feature CTRL-ALT-L in every changed file before commit

Committing Changes / Pull Requests
---------------------------------

1. Make a fork of [repository](https://github.com/nightscout/AndroidAPS) on GitHub (be aware to uncheck the box "Copy the master branch only")
2. Create separate branch for each feature, branch from most recent dev
3. Commit all changes to your fork
4. When ready, rebase on top of dev and make Pull Request to main repo

Naming Conventions for Pull Requests / Branches
-----------------------------------------------

TODO

Translations
------------

* If possible, always use Android translation mechanism (with strings.xml and @strings/id) instead of hardcoded texts
* Provide only English strings - all other languages will be crowd translated via Crowdin (https://crowdin.com/project/androidaps and https://crowdin.com/project/androidapsdocs)

Hints
-----

* Start small, it is easier to review smaller changes that affect fewer parts of code 
* Take a look into Issues list (https://github.com/nightscout/AndroidAPS/issues) - maybe there is something you can fix or implement
* For new features, make sure there is Issue to track progress and have on-topic discussion
* Reach out to community, discuss idea on Discord (https://discord.gg/4fQUWHZ4Mw)
* Speak with other developers to minimize merge conflicts. Find out who worked, working or plan to work on specific issue or part of app



New Jetpack Compose UI + Dagger
=================================

NOTE: I have added live example on how this work into virtualpump (disabled by default, but you can enable it,
    which will create additional button in Fragment).


Integrating with Dagger
------------------------
When using new Compose API, you need to use ComponentActivity in which you put your content. This wouldn't really be
problem by itself, but together with Dagger you get a little bit of mess, since you will need at least few
classes injected.

Solution is done with dagger.Subcompoents and bindings (everything is done only on module level).

Solution requires to create 1 new class in your module, something like this:

@Subcomponent
interface TandemComposeUiComponent : ComposeUi {
    fun inject(activity: ActionsActivity)
    fun inject(activity: DataActivity)
    fun inject(activity: PairingActivity)


    @Subcomponent.Factory
    interface FactoryCompose : ComposeUiFactory {
        override fun create(): TandemComposeUiComponent
    }
}


For your solution you just need to change the name and insert "fun inject()" for each activity. So in this module we
have 3 specific "main" activities. The way Compose works is that you need just the starting point and all sub-windows
are just Compose elements, so you just need "entry" activity.

Next change that is required is entry in your Dagger Module file:


    @Binds
    @IntoMap
    @ComposeUiModule("tandem")
    abstract fun bindTandemComposeUiFactory(factory: TandemComposeUiComponent.FactoryCompose): ComposeUiFactory

ComposeUiModule name needs to be unique across whole app, so using driver name (in case of pump driver) is a
good solution.

Also on main Module file you need to specify subComponent you created

@Module(subcomponents = [TandemComposeUiComponent::class])



Now in every ComposeActivity, you need to do following:

1. you activity needs to extend DaggerComponentActivity (DaggerComponentActivity is just marker class that tells dagger
what to inject, it is just abstract class that extends ComponentActivity), and next step is of course to add all
your injects...

So something like:

	@Inject lateinit var aapsLogger: AAPSLogger


2. final change is to add following code onCreate:

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val composeUiComponent = (application as ComposeUiProvider)
            .getComposeUiModule("tandem") as TandemComposeUiComponent

        composeUiComponent.inject(this)

        // .... other code

        enableEdgeToEdge()
        setContent {

			// ... Compose Ui Code (elements with @Composable attribute)

        }
     }


Basic setup in module
------------------------

1.) Other config

android {

    buildFeatures {
        compose=true
    }
}

2.) Plugins

plugins {
    alias(libs.plugins.compose.compiler)
}

3.) Dependencies

Mostly depends what you need:

Required:

    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))

Preview: (last 2 needed for preview, first two might be needed always)

    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling)
    implementation(libs.androidx.ui.tooling.preview)

Others:

    implementation(libs.androidx.compose.material3)   // Material 3 interface
    implementation(libs.androidx.compose.material)    // Material interface (both interfaces shouldn't be mixed, at least not in same screen)
    implementation(libs.androidx.compose.foundation)  // base classes

    implementation(libs.androidx.lifecycle.runtime.compose) // if you will use livedata and lifecyles
    implementation(libs.androidx.compose.runtime.livedata)

    implementation(libs.androidx.compose.navigation)  // if you use navigation models


Live Example
-------------

You will be able to see full implementation in Tandem pump module, but for now I have added simple
code into Virtual Pump.

Everything (except Dagger stuff is in pump.virtual.composeui). We have one TestActivity
(which needs to be registered in AndroidManifest.xml and in VirtualPumpComposeUiComponent) and one
HelloWorld screen.

If we had several screens there, they would need to be defined in TestActivity (like now TEST_1 is)
and you can then create simple navigation from there. You then call Composable from there... Composables
can be seperate files, but they don't need to be, so theroeticaly you could create 10 different screens
and define all of them in single file. From practical point of view, I would recomend each screen be its
own file, and if you have "utility" composables, those can be grouped together in single file...

To enable compose demo, you will need to set composeTestEnabled to true in VirtualPumpFragment.

At the moment we don't have project wide theme defined, so we have this "replacement" theme
that needs to be defined in each project, this is what is in folder composeui/theme. At some point
we would need to create app-wide theme, to use instead of that.

