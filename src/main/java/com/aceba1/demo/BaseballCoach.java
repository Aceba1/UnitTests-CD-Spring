package com.aceba1.demo;

public class BaseballCoach implements Coach{

  FortuneService service;

  public BaseballCoach(HappyFortuneService service) {
    this.service = service;
    System.out.println(service);
  }

  @Override
  public String getDailyWorkout() {
    return "Spend 30 minutes on batting practice";
  }

  @Override
  public String getDailyFortune() {
    return service.getFortune();
  }
}
