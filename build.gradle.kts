plugins {
    java
    idea
    id("io.freefair.lombok") version "8.10"
}

group = "io.futurecompany"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.codeborne:selenide:7.4.2")
    implementation("org.testng:testng:7.10.2")
    implementation("org.slf4j:slf4j-api:2.0.7")
    implementation("org.slf4j:slf4j-simple:2.0.7")
}

tasks.test {
    useTestNG {
        suites("src/test/resources/testng.xml")
    }
    testLogging {
        events("passed", "skipped", "failed")
    }
}

