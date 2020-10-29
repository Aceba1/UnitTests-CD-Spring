package com.aceba1.demoapp;

public class SadFortuneService implements FortuneService {
  @Override
  public String getFortune() {
    return "Today is a day ;~;";
  }
}
