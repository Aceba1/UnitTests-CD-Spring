package com.aceba1.demoapp;

import org.springframework.stereotype.Component;

@Component
public class JAVACoach implements Coach {
  @Override
  public String getDailyWorkout() {
    return "Write a 2000 line calculator program";
  }

  @Override
  public String getDailyFortune() {
    return null;
  }
}
