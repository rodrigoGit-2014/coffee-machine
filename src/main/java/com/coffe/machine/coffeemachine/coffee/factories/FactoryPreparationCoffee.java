package com.coffe.machine.coffeemachine.coffee.factories;


import com.coffe.machine.coffeemachine.coffee.preparation.ClassicPreparation;
import com.coffe.machine.coffeemachine.coffee.preparation.LattePreparation;
import com.coffe.machine.coffeemachine.coffee.preparation.MockaPreparation;
import com.coffe.machine.coffeemachine.coffee.preparation.Preparation;

public class FactoryPreparationCoffee {


    public static Preparation getPreparation(String type) {
        if (type.equals("classic")) {
            return new ClassicPreparation();
        } else if (type.equals("late")) {
            return new LattePreparation();
        } else if (type.equals("mocka")) {
            return new MockaPreparation();
        } else return null;
    }
}
