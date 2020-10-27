package com.aceba1.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

  @Autowired
  private FortuneService service;

//  @Autowired
//  public TennisCoach(FortuneService fortuneService) {
//    this.service = fortuneService;
//  }

  public TennisCoach() {
    System.out.println(">> TennisCoach : Default Constructor");
  }

  //@Autowired
  public void doMyTaxes(FortuneService fortuneService) {
    System.out.println(">> TennisCoach : Do My Bidding");
    service = fortuneService;
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
