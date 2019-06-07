package com.coffe.machine.coffeemachine.coffee;

import java.util.HashMap;
import java.util.Map;

public class Recipe {
    private String name;
    private Map<Ingredient, Integer> ingredients;


    public Recipe(String recipeName) {
        name = recipeName;
        ingredients = new HashMap<>();
    }

    public void addIngredient(Ingredient ingredient, Integer quantity) {
        ingredients.put(ingredient,quantity);
    }
}
