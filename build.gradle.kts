plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // JUnit 5
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")

    // AssertJ
    testImplementation("org.assertj:assertj-core:3.24.2") // 최신 버전 사용
}

tasks.test {
    useJUnitPlatform()
}
