package plugins

import com.android.build.api.dsl.CommonExtension
import com.android.build.gradle.LibraryExtension
import extensions.androidTestImplementation
import extensions.androidTestImplementationBom
import extensions.debugImplementation
import extensions.implementation
import extensions.implementationBom
import extensions.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class ComposePlugin : Plugin<Project> {
    override fun apply(project: Project) = with(project) {
        val extension = extensions.getByType<LibraryExtension>()
        configureCompose(extension)
    }
}

fun Project.configureCompose(commonExtension: CommonExtension<*, *, *, *, *, *>) {
    plugins.apply("org.jetbrains.kotlin.plugin.compose")

    commonExtension.apply {
        buildFeatures {
            compose = true
        }

        composeOptions {
            kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
        }
    }

    dependencies {
        implementation(project(":core:navigation"))
        if (project.name != "design") {
            implementation(project(":core:design"))
        }
        implementationBom(platform(libs.androidx.compose.bom))
        androidTestImplementationBom(platform(libs.androidx.compose.bom))
        implementation(libs.androidx.compose.navigation)
        implementation(libs.androidx.compose.activity)
        implementation(libs.androidx.compose.runtime)
        implementation(libs.androidx.compose.foundation)
        implementation(libs.androidx.compose.material3)
        implementation(libs.androidx.lifecycle.viewmodel)
        implementation(libs.androidx.lifecycle.compose)
        implementation(libs.androidx.compose.ui.tooling.preview)
        implementation(libs.compose.coil)
        implementation(libs.accompanist.uiController)
        implementation(libs.koin.compose)
        implementation(libs.compose.rebugger)
        implementation(libs.compose.lottie)

        implementation(libs.ktor.core)
        implementation(libs.ktor.logging)
        implementation(libs.ktor.negotiation)
        implementation(libs.ktor.okhttp)
        implementation(libs.ktor.serialization)
        implementation(libs.ktor.serializationJson)

        debugImplementation(libs.androidx.compose.ui.tooling.debug)
        androidTestImplementation(libs.androidx.compose.ui.test)
    }
}