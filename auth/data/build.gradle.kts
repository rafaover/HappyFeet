plugins {
    alias(libs.plugins.happyfeet.android.library)
    alias(libs.plugins.happyfeet.jvm.ktor)
}

android {
    namespace = "com.example.auth.data"
}

dependencies {

    implementation(projects.auth.domain)
    implementation(projects.core.domain)
    implementation(projects.core.data)
}