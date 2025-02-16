plugins {
    alias(libs.plugins.bulletjournal.android.library)
    alias(libs.plugins.bulletjournal.android.compose.library)
    alias(libs.plugins.bulletjournal.android.firebase.library)
}

android {
    namespace = Config.Core.Auth

    defaultConfig {
        buildConfigField("String", "PROJECT_ID", project.property("PROJECT_ID").toString())
        buildConfigField("String", "APP_ID", project.property("APP_ID").toString())
        buildConfigField("String", "API_KEY", project.property("API_KEY").toString())
    }
}