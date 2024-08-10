plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.oddlyspaced.wffbase"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.oddlyspaced.wffbase"
        minSdk = 33
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}