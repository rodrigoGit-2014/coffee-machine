package com.coffe.machine.coffeemachine.coffee.sizes;

public class Large implements SizeCoffee {
    private static int waterSize = 80;


    @Override
    public int getQuantity() {
        return waterSize;
    }


}
