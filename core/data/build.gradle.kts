plugins {
    alias(libs.plugins.template.kotlin.plugin.compose)
    alias(libs.plugins.template.android.library)
    alias(libs.plugins.template.android.compose.library)
}

android {
    namespace = Config.Core.Data
}