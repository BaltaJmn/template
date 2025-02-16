plugins {
    alias(libs.plugins.template.android.library)
}

android {
    namespace = Config.Core.Persistence
}

dependencies {
    implementation(libs.gson)
}