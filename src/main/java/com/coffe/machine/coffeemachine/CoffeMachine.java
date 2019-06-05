package com.coffe.machine.coffeemachine;

import com.coffe.machine.coffeemachine.coffee.factories.FactoryConsumption;
import com.coffe.machine.coffeemachine.coffee.factories.FactoryPreparationCoffee;
import com.coffe.machine.coffeemachine.coffee.preparation.Preparation;

public class CoffeMachine {

    private boolean isOn;

    private String led;

    public void pushButton(String coffeeType, String coffeeSize){

        Preparation coffee = FactoryPreparationCoffee.getPreparation(coffeeType);

        if (isOn){
            if (coffee.isAvailableToMakeCoffee(FactoryConsumption.getGlassType(coffeeSize))){
                led = "please take your coffee";
            };
        }
        led = "You coffee can not make it";

    }


}
