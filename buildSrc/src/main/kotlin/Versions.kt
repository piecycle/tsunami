import org.gradle.api.JavaVersion
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

object Versions {

    const val appVersion = "3.3.0-dev-c-Tsunami_3.4"
    const val versionCode = 1500

    const val ndkVersion = "21.1.6352462"

    const val compileSdk = 34
    const val minSdk = 28
    const val targetSdk = 28
    const val wearMinSdk = 26
    const val wearTargetSdk = 29

    val javaVersion = JavaVersion.VERSION_21
    val jvmTarget = JvmTarget.JVM_21
    const val jacoco = "0.8.11"
}
