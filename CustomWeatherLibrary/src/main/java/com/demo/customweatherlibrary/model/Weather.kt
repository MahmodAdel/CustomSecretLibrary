package com.demo.customweatherlibrary.model

data class Weather(
    val name: String,
    val temperature: Double,
    val condition: String,
    val description: String,
    val timeStamp:String,
    val lat:Double,
    val lon:Double
)
