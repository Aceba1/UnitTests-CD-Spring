package com.aceba1.demoapp;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
  @Override
  public String getFortune() {
    return "You will have many cans of beans!";
  }
}
