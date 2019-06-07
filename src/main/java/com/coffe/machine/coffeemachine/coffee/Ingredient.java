package com.coffe.machine.coffeemachine.coffee;

public class Ingredient {

    private String name;
    private int quantity;

    public Ingredient(String name) {
        this.name = name;
     //   this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
