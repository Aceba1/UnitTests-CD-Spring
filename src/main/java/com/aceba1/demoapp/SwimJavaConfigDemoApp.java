package com.aceba1.demoapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
  public static void main(String[] args) {

    // read spring config file
    AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext(SportConfig.class);

    // get the bean from spring container
    SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class); // Lowercase
    Coach otherCoach = context.getBean("swimCoach", Coach.class); // Lowercase

    // call a method on the bean
    System.out.println(" - " + theCoach.getDailyWorkout());
    System.out.println(" - " + otherCoach.getDailyFortune());
    System.out.println(" - email: " + theCoach.getEmail());
    System.out.println(" - team: " + theCoach.getTeam());

    // close the context
    context.close();
  }
}
