package com.aceba1.demoapp;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.aceba1.demoapp") // Use in pair with @Component
@PropertySource("classpath:application.properties")
public class SportConfig {

  @Bean
  @Scope("singleton") // Only calls once, retains value
  public FortuneService sadFortuneService() {
    System.out.println("Called sadFortuneService Bean");
    return new SadFortuneService();
  }

  @Bean
  @Scope("prototype") // Create a new instance every .getBean("swimCoach");
  public Coach swimCoach() {
    System.out.println("Called swimCoach Bean");
    return new SwimCoach(sadFortuneService());
  }

}
