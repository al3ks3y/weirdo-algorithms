plugins {
    kotlin("jvm") version "2.2.20-RC2"
    application
}

group = "me.macbookair"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("MainKt")
}