package com.training.SES.AnnotationBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Traveler {

    private Vehicle vehicle;

    @Autowired
    public Traveler(@Qualifier("car") Vehicle vehicle){

        this.vehicle = vehicle;
    }


    public void startJourney(){
        this.vehicle.move();
    }
}
