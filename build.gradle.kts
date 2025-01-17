import org.tribot.gradle.plugin.TribotPlugin

plugins {
    java
    kotlin("jvm") version "1.6.10"
}

buildscript {
    configurations {
        classpath {
            resolutionStrategy.cacheDynamicVersionsFor(5, TimeUnit.MINUTES)
        }
    }
    repositories {
        mavenCentral()
        maven("https://gitlab.com/api/v4/projects/20741387/packages/maven")
    }
    dependencies {
        classpath("org.tribot:tribot-gradle-plugin:+")
    }
}

apply<TribotPlugin>()