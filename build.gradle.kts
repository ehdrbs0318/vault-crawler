import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.0"
    kotlin("plugin.serialization") version "1.4.0"
}
group = "dev.donggyun.vault-crawler"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    implementation("com.github.ajalt.clikt:clikt:3.0.1")
    implementation("io.ktor:ktor-client-core:1.4.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.0.0-RC")
    testImplementation(kotlin("test-junit5"))
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}