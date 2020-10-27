package com.aceba1.demoapp;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

  private String[] responses = {
    "Garbanzos",
    "Broccoli",
    "Tofu",
    "Rice"
  };

  private Random random = new Random();

  @Override
  public String getFortune() {
    return responses[random.nextInt(responses.length)];
  }
}
