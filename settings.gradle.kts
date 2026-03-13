// In /settings.gradle.kts

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        // This is where Gradle finds the 'org.jetbrains.kotlin.plugin.compose' plugin
        maven("https://androidx.dev/storage/compose-compiler/repository/")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // Add this line here as well
        maven("https://androidx.dev/storage/compose-compiler/repository/")
    }
}

rootProject.name = "SurveyAppStarter"
include(":app")