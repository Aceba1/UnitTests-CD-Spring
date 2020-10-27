package com.aceba1.demoapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
  public static void main(String[] args) {

    // read spring config file
    ClassPathXmlApplicationContext context =
      new ClassPathXmlApplicationContext("applicationContext.xml");

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
