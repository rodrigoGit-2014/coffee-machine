package com.coffe.machine.coffeemachine.coffee.supply;

public class WaterTank {
    private static int quantity;

    public void reduceWater(int qty){
        quantity = qty;
    }

    public static int getQuantity(){
        return quantity;
    }
}
