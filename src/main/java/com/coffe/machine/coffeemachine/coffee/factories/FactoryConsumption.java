package com.coffe.machine.coffeemachine.coffee.factories;

import com.coffe.machine.coffeemachine.coffee.sizes.Large;
import com.coffe.machine.coffeemachine.coffee.sizes.Medium;
import com.coffe.machine.coffeemachine.coffee.sizes.SizeCoffee;
import com.coffe.machine.coffeemachine.coffee.sizes.Small;

public class FactoryConsumption {

    public static SizeCoffee getGlassType(String size) {
        if (size.equals("large")) {
            return new Large();
        } else if (size.equals("medium")) {
            return new Medium();
        } else if (size.equals("small")) {
            return new Small();
        } else return null;

    }
}
