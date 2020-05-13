plugins {
    application
    kotlin("jvm") version "1.4-M1"
}

version = "1.0.2"
group = "org.gradle.sample"

application {
    mainClass.set("org.gradle.sample.app.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}
