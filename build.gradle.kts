// Top-level build file

plugins {
    // keep it simple, match your module's style
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false

    // this one we do need explicitly so Firebase works
    id("com.google.gms.google-services") version "4.4.2" apply false
}
