package com.coffe.machine.coffeemachine.coffee;

import java.util.Iterator;
import java.util.Map;

public class Dispenser {

    private int id;

    private Supply supplies;

    public Dispenser(int id) {
        this.id = id;
        supplies = new Supply();
    }

    public void setSupplies(Supply supplies) {
        this.supplies = supplies;
    }


    public boolean canMakeProduct(Recipe recipe) {

        Iterator<Map.Entry<Ingredient, Integer>> itr = recipe.getIngredients().entrySet().iterator();

        boolean isEnoughSupply = true;

        while (itr.hasNext() && isEnoughSupply) {
            Map.Entry<Ingredient, Integer> entry = itr.next();

            Integer supplyQuantity = supplies.getQuantity(entry.getKey());
            Integer ingredientQuantity = entry.getValue();

            isEnoughSupply = supplyQuantity >= ingredientQuantity;
        }
        return isEnoughSupply;
    }

    public void updateSupplies(Recipe recipe) {
        for (Map.Entry<Ingredient, Integer> entry : recipe.getIngredients().entrySet()) {
            supplies.setQuantity(entry.getKey(), entry.getValue());

        }
    }

    public void printSupplies() {
        for (Map.Entry<Ingredient, Integer> entry : supplies.getSuppliers().entrySet()) {
            System.out.println("key: " + entry.getKey() + " --  value: " + entry.getValue());

        }
    }
}
