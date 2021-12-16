plugins {
    `kotlin-dsl`
}
repositories {
    google()
    mavenCentral()
}

object Plugins {
    const val AGP = "7.1.0-alpha03"
    const val DOKKA = "1.5.0"
    const val KOTLIN = "1.5.21"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${Plugins.KOTLIN}")
    implementation("com.android.tools.build:gradle:7.1.0-alpha03")
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:${Plugins.DOKKA}")
    implementation("org.jetbrains.dokka:dokka-core:${Plugins.DOKKA}")
}
