package com.training.SES.AnnotationBasedConfiguration;

import com.training.SES.JavaBasedConfigurations.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

;


public class MainApp {
    public static void main(String[] args) {
        ApplicationContext apc = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = apc.getBean(Car.class);
        car.move();

        Bike bike = apc.getBean(Bike.class);
        bike.move();

        Traveler tc = apc.getBean(Traveler.class);
        tc.startJourney();

    }
}
