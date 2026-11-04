plugins {
    application
}

repositories {
    mavenCentral()
}

val jqwikVersion = "1.10.2"

tasks.compileTestJava {
    options.compilerArgs.add("-parameters")
}

tasks.test {
    useJUnitPlatform {
        includeEngines("junit-jupiter", "jqwik")
    }
}



dependencies {
implementation("jakarta.validation:jakarta.validation-api:3.1.1")
    // Use JUnit Jupiter for testing.
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testImplementation("org.instancio:instancio-junit:6.2.1")
    testImplementation("org.assertj:assertj-core:3.23.1")
    testImplementation("net.jqwik:jqwik:${jqwikVersion}")

    // This dependency is used by the application.
    implementation(libs.guava)
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    // Define the main class for the application.
    mainClass = "org.example.App"
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
