package com.aceba1.demoapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

  public static void main(String[] args) {
    // Load spring config file

    ClassPathXmlApplicationContext context =
      new ClassPathXmlApplicationContext("applicationContext.xml");

    // Retrieve bean from spring container
    Coach theCoach = context.getBean("tennisCoach", Coach.class);
    Coach otherCoach = context.getBean("tennisCoach", Coach.class);

    // print out the results

    System.out.println("\nPointing to the same object? " + (theCoach == otherCoach));
    System.out.println("\nCoach A : " + theCoach);
    System.out.println("\nCoach B : " + otherCoach);
  }
}
