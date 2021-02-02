package com.digite.kata.tracker;

public class WeatherTracker {
    
    public String setCurrentConditions(NotificationGenerator generator, String weatherDescription) {
        return generator.generateWeatherAlert(weatherDescription);
    }
}
