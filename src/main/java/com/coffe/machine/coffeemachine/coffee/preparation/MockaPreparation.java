package com.coffe.machine.coffeemachine.coffee.preparation;

import com.coffe.machine.coffeemachine.coffee.sizes.SizeCoffee;
import com.coffe.machine.coffeemachine.coffee.supply.ChocolateTank;
import com.coffe.machine.coffeemachine.coffee.supply.CoffeTank;
import com.coffe.machine.coffeemachine.coffee.supply.MilkTank;
import com.coffe.machine.coffeemachine.coffee.supply.WaterTank;
import com.coffe.machine.coffeemachine.coffee.types.Mocka;

public class MockaPreparation implements Preparation {


    @Override
    public boolean isAvailableToMakeCoffee(SizeCoffee glass) {

        if ((WaterTank.getQuantity() > glass.getQuantity()) &&
                (CoffeTank.getQuantity() > Mocka.getCoffeSpoons()) &&
                (MilkTank.getQuantity() > Mocka.getMilkSpoons()) &&
                (ChocolateTank.getQuantity() > Mocka.getChocolateSpoons())) {
            System.out.println("preparing mocka coffee");
            return true;
        }
        return false;
    }
}
