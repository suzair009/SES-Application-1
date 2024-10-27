package com.training.SES.JavaBasedConfigurations;

public class Traveller {
    private Vechile vechile;
    Traveller(Vechile vechile){
        this.vechile = vechile;
    }

    public void startJourney(){
        this.vechile.move();
    }
}
