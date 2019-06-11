package com.coffe.machine.coffeemachine.coffee;

import java.util.HashMap;
import java.util.Map;

public class Supply {

    private Map<Ingredient, Integer> suppliers;


    public Supply() {
        suppliers = new HashMap<>();

    }

    public void addSupply(Ingredient ingredient, int quantity) {
        suppliers.put(ingredient, quantity);
    }

    public Integer getQuantity(Ingredient ingredient) {
        return suppliers.get(ingredient);
    }

    public void setQuantity(Ingredient ingredient, Integer qty) {
        Integer newQty = suppliers.get(ingredient) - qty;
        suppliers.put(ingredient, newQty);
    }

    public Map<Ingredient, Integer> getSuppliers() {
        return suppliers;
    }
}
