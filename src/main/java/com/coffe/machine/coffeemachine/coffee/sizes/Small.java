package com.coffe.machine.coffeemachine.coffee.sizes;

public class Small implements SizeCoffee {
    private static int waterSize = 30;

    @Override
    public int getQuantity() {
        return waterSize;
    }


}
