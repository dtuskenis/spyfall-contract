plugins {
    kotlin("jvm") version (KOTLIN_VERSION)
    kotlin("plugin.serialization") version (KOTLIN_VERSION)
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.dtuskenis"
            artifactId = "spyfall-contract"
            version = "0.1.0"

            from(components["java"])
        }
    }
}

sourceSets {
    main {
        java {
            srcDir("src/kotlin")
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$KOTLIN_VERSION")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$KOTLIN_SERIALIZATION_VERSION")
}
