package com.aceba1.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

  private FortuneService service;

  @Autowired
  public TennisCoach(FortuneService fortuneService) {
    this.service = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Practice your backend volley";
  }

  @Override
  public String getDailyFortune() {
    return service.getFortune();
  }
}
