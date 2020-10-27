package com.aceba1.demoapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

  // Use commas to separate elements in array!
  @Value("${fortune.random}")
  private String[] responses;

  private Random random = new Random();

  @Override
  public String getFortune() {
    return responses[random.nextInt(responses.length)];
  }
}
