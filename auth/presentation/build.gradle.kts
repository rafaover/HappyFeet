plugins {
    alias(libs.plugins.happyfeet.android.feature.ui)
}

android {
    namespace = "com.example.auth.presentation"
}

dependencies {
//    implementation(project(":auth:domain"))
//    implementation(project(":core:domain"))
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}