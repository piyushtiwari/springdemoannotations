package com.piyush.springdemo;

import org.springframework.stereotype.Component;

@Component
public class KabaddiCoach implements Coach {

    public String getDailyWorkout() {
        return "Practice Raids";
    }

    public String getDailyFortune() {
        return null;
    }
}
