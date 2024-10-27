package com.training.SES.AnnotationBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve Spring Beans from Spring IOC Container
//        Car car = applicationContext.getBean(Car.class);
//        car.move();

//        Bike bike = applicationContext.getBean(Bike.class);
//        bike.move();

        Traveler traveler = applicationContext.getBean(Traveler.class);
        traveler.startJourney();
    }
}
