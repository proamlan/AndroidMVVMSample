// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    val android_gradle_plugin_version by extra("8.0.1")
}

plugins {
    id("com.android.application") version "${extra["android_gradle_plugin_version"]}" apply false
    id("com.android.library") version "${extra["android_gradle_plugin_version"]}" apply false
    id("org.jetbrains.kotlin.android") version "1.8.20" apply false
}

