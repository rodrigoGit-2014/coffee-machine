package com.coffe.machine.coffeemachine.coffee.preparation;

import com.coffe.machine.coffeemachine.coffee.sizes.SizeCoffee;
import com.coffe.machine.coffeemachine.coffee.supply.CoffeTank;
import com.coffe.machine.coffeemachine.coffee.supply.MilkTank;
import com.coffe.machine.coffeemachine.coffee.supply.WaterTank;
import com.coffe.machine.coffeemachine.coffee.types.Late;


public class LattePreparation implements Preparation {

    @Override
    public boolean isAvailableToMakeCoffee(SizeCoffee glass) {

        if (WaterTank.getQuantity() > glass.getQuantity() &&
                CoffeTank.getQuantity() > Late.getCoffeeSpoons() &&
                MilkTank.getQuantity() > Late.getMilkSpoons()) {
            System.out.println("preparing latte coffee");
            return true;
        }
        return false;
    }
}
