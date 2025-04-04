plugins {
    alias(libs.plugins.template.android.library)
}

android {
    namespace = Config.Core.Navigation
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.navigation)
}