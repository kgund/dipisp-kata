package com.digite.kata.tracker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherTrackerTest {
    WeatherTracker weatherTracker;

    @BeforeEach
    public void setup(){
        weatherTracker = new WeatherTracker();
    }

    @Test
    public void trackRainyWeather(){
        NotificationGenerator generator = new Phone();
        String message = weatherTracker.setCurrentConditions(generator, "Rainy");
        Assertions.assertEquals("It is Rainy", message);
    }

    @Test
    public void trackSunnyWeather(){
        NotificationGenerator generator = new Emailer();
        String message = weatherTracker.setCurrentConditions(generator, "Sunny");
        Assertions.assertEquals("It is Sunny", message);
    }

}
