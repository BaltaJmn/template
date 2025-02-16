rootProject.name = "Template"

pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

//app
include(
    ":app",
)

//Core
include(
    ":core:common",
    ":core:data",
    ":core:design",
    ":core:navigation",
    ":core:network",
    ":core:persistence",
)

//Features
include(
    ":features:splash",
    ":features:home"
)