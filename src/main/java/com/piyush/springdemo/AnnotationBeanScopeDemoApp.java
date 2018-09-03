package com.piyush.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        // load the config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (theCoach==alphaCoach);

        System.out.println("Point to the same object: " + result);
        System.out.println("Memory loacation for theCoach: " + theCoach);
        System.out.println("Memory loacation for alphaCoach: " + alphaCoach);

        context.close();
    }
}
