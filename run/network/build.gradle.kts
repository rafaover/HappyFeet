plugins {
    alias(libs.plugins.happyfeet.android.library)
}

android {
    namespace = "com.example.run.network"
}

dependencies {

    implementation(projects.core.domain)
    implementation(projects.core.data)
}