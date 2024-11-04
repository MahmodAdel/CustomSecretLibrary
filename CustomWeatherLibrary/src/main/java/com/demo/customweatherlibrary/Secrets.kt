package com.demo.customweatherlibrary

class Secrets {

    // Method calls will be added by gradle task hideSecret
    // Example : external fun getWellHiddenSecret(packageName: String): String

    companion object {
        init {
            System.loadLibrary("secrets")
        }
    }

    external fun getbaseUrl(packageName: String): String

    external fun getapiKey(packageName: String): String
}