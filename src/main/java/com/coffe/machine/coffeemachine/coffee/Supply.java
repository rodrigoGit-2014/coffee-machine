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
}
