plugins {
    alias(libs.plugins.happyfeet.android.library)
    alias(libs.plugins.happyfeet.jvm.ktor)
}

android {
    namespace = "com.example.run.network"
}

dependencies {

    implementation(projects.core.domain)
    implementation(projects.core.data)
}