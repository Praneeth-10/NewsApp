object Dependencies {

    val coreKtx by lazy {   "androidx.core:core-ktx:${Versions.coreKtx}"    }
    val lifecycleRuntimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val material by lazy { "com.google.android.material:material:${Versions.material}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val composeBom by lazy { "androidx.compose:compose-bom:${Versions.compose}"}
    val composeUi by lazy { "androidx.compose.ui:ui" }
    val composeUiGraphics by lazy { "androidx.compose.ui:ui-graphics" }
    val composeUiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val composematerial3 by lazy { "androidx.compose.material3:material3" }
    val navigationCompose by lazy { "androidx.navigation:navigation-compose:${Versions.navigationCompose}"}
    val lifecycleViewModelKtxCompose by lazy { "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycleViewModelKtxCompose}" }
    val junitTest by lazy { "junit:junit:${Versions.junitTest}" }
    val junitAndroidTest by lazy { "androidx.test.ext:junit:${Versions.junitAndroidTest}"}
    val espressoAndroidTest by lazy { "androidx.test.espresso:espresso-core:" }
    val composeTestJunit4 by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.compose}" }
    val composeUITooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.compose}" }
    val composeUITestManifest by lazy { "androidx.compose.ui:ui-test-manifest:${Versions.compose}" }

}

object Modules{
    const val utilities = ":utilities"
}