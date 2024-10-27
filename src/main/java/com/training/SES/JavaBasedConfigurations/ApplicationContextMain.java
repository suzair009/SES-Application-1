package com.training.SES.JavaBasedConfigurations;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextMain {
   public static void main(String[] args) {
      ApplicationContext apc = new AnnotationConfigApplicationContext(AppConfig.class);
      Car car = apc.getBean(Car.class);
      car.move();

      Bike bike = apc.getBean(Bike.class);
      bike.move();

      Traveller tc = apc.getBean(Traveller.class);
      tc.startJourney();




   }

}
