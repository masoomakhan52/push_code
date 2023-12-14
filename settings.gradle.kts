pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
    repositories {
        jcenter()
    }
}


buildscript {
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "myapp"
include(":app")
 