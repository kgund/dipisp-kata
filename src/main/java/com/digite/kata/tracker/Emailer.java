package com.digite.kata.tracker;

public class Emailer implements NotificationGenerator {
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
