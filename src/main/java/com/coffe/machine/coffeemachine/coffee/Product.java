package com.coffe.machine.coffeemachine.coffee;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private List<Recipe> recipes;

    public Product(String product) {
        name = product;
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public String getName() {
        return name;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }
}
