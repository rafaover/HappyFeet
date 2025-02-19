plugins {
    alias(libs.plugins.happyfeet.android.library)
    alias(libs.plugins.happyfeet.android.room)
}

android {
    namespace = "com.example.core.database"
}

dependencies {

    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}