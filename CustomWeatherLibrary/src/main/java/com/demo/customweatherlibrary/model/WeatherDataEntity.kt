package com.demo.customweatherlibrary.model

data class WeatherDataEntity (
    val id: Int=0,
    val name: String,
    val temperature: Double,
    val condition: String,
    val description: String,
    val timeStamp:String,
    var lat:Double,
    val lon:Double
)