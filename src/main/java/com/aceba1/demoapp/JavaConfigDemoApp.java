package com.aceba1.demoapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
  public static void main(String[] args) {

    // read spring config file
    AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext(SportConfig.class);

    // get the bean from spring container
    Coach theCoach = context.getBean("tennisCoach", Coach.class); // Lowercase
    //Coach theOtherCoach = context.getBean("JAVACoach", Coach.class); // Keeps case

    // call a method on the bean
    System.out.println(" - " + theCoach.getDailyWorkout());
    System.out.println(" - " + theCoach.getDailyFortune());
    //System.out.println(" - " + theOtherCoach.getDailyWorkout());

    // close the context
    context.close();
  }
}
