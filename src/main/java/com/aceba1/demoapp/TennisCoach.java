package com.aceba1.demoapp;

import org.springframework.stereotype.Component;

@Component(value = "thatSillyCoach")
public class TennisCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Practice your backend volley";
  }
}
