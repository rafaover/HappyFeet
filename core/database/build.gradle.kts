plugins {
    alias(libs.plugins.happyfeet.android.library)
}

android {
    namespace = "com.example.core.database"
}

dependencies {

    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}