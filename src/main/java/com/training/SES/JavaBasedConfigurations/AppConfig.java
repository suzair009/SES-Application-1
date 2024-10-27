package com.training.SES.JavaBasedConfigurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Vechile Car(){
        return  new Car();
    }

    @Bean
    public Vechile Bike(){
        return new Bike();
    }

    @Bean
    public Traveller traveller(){
        return  new Traveller(Car());
    }


}
