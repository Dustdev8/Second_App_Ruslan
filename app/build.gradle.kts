plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.second_app_ruslan"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.second_app_ruslan"
        minSdk = 24
        targetSdk = 34
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
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.androidx.espresso.idling.resource)

    // Test implementations
    testImplementation ("junit:junit:4.13.2")
    testImplementation(libs.androidx.junit)
    testImplementation(libs.androidx.runner)
    testImplementation(libs.androidx.runner)
    testImplementation(libs.androidx.espresso.core)
    testImplementation(libs.androidx.rules) // Or latest version

    // Android test implementations
    androidTestImplementation ("androidx.test.ext:junit:1.1.5") // Or latest version
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1") // Or latest version
    androidTestImplementation ("androidx.test:runner:1.5.2") // Or latest version
    androidTestImplementation ("androidx.test:rules:1.5.0") // Or latest version
    testImplementation ("org.powermock:powermock-module-junit4:2.0.9") // Or latest version
    testImplementation ("org.powermock:powermock-api-mockito2:2.0.9") // Or latest version
    testImplementation ("org.mockito:mockito-core:4.0.0")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")


}