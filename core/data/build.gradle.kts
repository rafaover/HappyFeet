plugins {
    alias(libs.plugins.happyfeet.android.library)
    alias(libs.plugins.happyfeet.jvm.ktor)
}

android {
    namespace = "com.example.core.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}