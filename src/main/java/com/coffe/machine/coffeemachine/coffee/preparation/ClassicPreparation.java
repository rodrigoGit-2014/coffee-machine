package com.coffe.machine.coffeemachine.coffee.preparation;

import com.coffe.machine.coffeemachine.coffee.sizes.SizeCoffee;
import com.coffe.machine.coffeemachine.coffee.supply.CoffeTank;
import com.coffe.machine.coffeemachine.coffee.supply.WaterTank;
import com.coffe.machine.coffeemachine.coffee.types.Classic;

public class ClassicPreparation implements Preparation {

    @Override
    public boolean isAvailableToMakeCoffee(SizeCoffee glass) {
        if (WaterTank.getQuantity() > glass.getQuantity() && CoffeTank.getQuantity() > Classic.getCoffeeSpoons()) {
            System.out.println("preparing classic coffee");
            return true;
        }

        return false;
    }
}
