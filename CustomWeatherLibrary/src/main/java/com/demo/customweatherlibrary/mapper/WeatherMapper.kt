package com.demo.customweatherlibrary.mapper


import com.demo.customweatherlibrary.model.ApiResponse
import com.demo.customweatherlibrary.model.Weather
import com.demo.customweatherlibrary.model.WeatherDataEntity


public fun WeatherDataEntity.toDomainFromLocal(): Weather {
    return Weather(
        name, temperature, condition, description, timeStamp, lat, lon
    )
}

public fun ApiResponse.toDomainFromLocal(): Weather {
    return Weather(
        name = name,
        temperature = main.temp,
        condition = weather[0].main,
        description = weather[0].description,
        timeStamp = "",
        lat = coord.lat,
        lon = coord.lon
    )
}

public fun ApiResponse.toLocalFromRemote(): WeatherDataEntity {
    return WeatherDataEntity(
        name = name,
        temperature = main.temp,
        condition = weather[0].main,
        description = weather[0].description,
        timeStamp = "",
        lat = coord.lat,
        lon = coord.lon
    )
}
