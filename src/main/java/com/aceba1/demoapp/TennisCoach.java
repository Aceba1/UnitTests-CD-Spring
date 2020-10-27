package com.aceba1.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

  private FortuneService service;

  @Autowired
  public TennisCoach(
    @Qualifier("randomFortuneService")
      FortuneService fortuneService
    // This is where more would be placed
  ) {
    System.out.println(">> TennisCoach : Fortune Constructor");
    this.service = fortuneService;
  }

  public TennisCoach() {
    System.out.println(">> TennisCoach : Default Constructor");
  }

  //@Autowired
  public void setFortuneService(FortuneService fortuneService) {
    System.out.println(">> TennisCoach : Do My Bidding");
    service = fortuneService;
  }

  @PostConstruct
  private void onStartup() {
    System.out.println(">> TennisCoach : On Startup");
  }

  @PreDestroy
  private void onCleanup() {
    System.out.println(">> TennisCoach : On Cleanup");
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
