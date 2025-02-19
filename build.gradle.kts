plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("com.google.gms.google-services")
}

android {
    namespace = "apcoders.in.carpark"
    compileSdk = 35

    defaultConfig {
        applicationId = "apcoders.in.carpark"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(platform("com.google.firebase:firebase-bom:33.9.0"))
    implementation ("com.google.firebase:firebase-database:20.2.1")  // Use the latest version
    implementation ("com.github.GrenderG:Toasty:1.5.2")
    implementation ("androidx.compose.animation:animation:1.7.6")
    implementation ("androidx.compose.material:material:1.0.0")
    implementation ("com.google.android.material:material:1.9.0")
    implementation ("androidx.compose.ui:ui-tooling-preview:1.0.0")
    implementation ("androidx.activity:activity-compose:1.10.0")
    implementation(libs.firebase.auth)
    implementation ("com.google.android.gms:play-services-location:21.0.1")

    implementation ("com.google.android.libraries.places:places:3.2.0")
    implementation("com.razorpay:checkout:1.6.41")
    implementation(libs.firebase.firestore)
    implementation(libs.animation.core.android)
    implementation (libs.android.spinkit)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.filament.android)
    testImplementation(libs.junit)
    implementation (libs.journeyapps.zxing.android.embedded)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation (libs.firebase.storage)
    implementation (libs.gson) // For JSON conversion
    implementation(libs.play.services.maps)
    implementation(libs.play.services.location)
    implementation (libs.google.places)
    implementation (libs.sdp.android)
    implementation (libs.material.v1110)
    implementation (libs.picasso)
    implementation (libs.glide)
    annotationProcessor (libs.compiler)
    implementation (libs.glide)
    annotationProcessor (libs.compiler)
}