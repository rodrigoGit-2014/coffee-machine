package com.coffe.machine.coffeemachine.coffee.sizes;

public class Medium implements SizeCoffee {
    private static int waterSize = 50;


    @Override
    public int getQuantity() {
        return waterSize;
    }


}
