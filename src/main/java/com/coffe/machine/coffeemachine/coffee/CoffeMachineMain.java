package com.coffe.machine.coffeemachine.coffee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class CoffeMachineMain {

    public static void main(String[] args) {

      
        List<Product> products = createProducts();

        Supply supplier = createSupply();


        //Defining dispenser

        Dispenser dispenserOne = new Dispenser(1);
        dispenserOne.setSupplies(supplier);
        dispenserOne.printSupplies();
        Recipe recipe = getReceipe("latte","Latte Medium", products);
        boolean isPossibleToMake = dispenserOne.canMakeProduct(recipe);
        dispenserOne.updateSupplies(recipe);
        dispenserOne.printSupplies();

    }

    private static Recipe getReceipe(String prodName, String recipeName, List<Product> products){
        for (Product product:products){
            if (product.getName().equals(prodName)){
                for(Recipe recipe:product.getRecipes()){
                    if (recipe.getName().equals(recipeName)){
                        return recipe;
                    }
                }
            }
        }
        return null;
    }

    private static Supply createSupply(){
        //defining ingredients
        Ingredient coffee = new Ingredient("coffee");
        Ingredient water = new Ingredient("water");
        Ingredient milk = new Ingredient("milk");
        Ingredient chocolate = new Ingredient("chocolate");

        Supply supplies = new Supply();
        supplies.addSupply(coffee, 10);
        supplies.addSupply(water, 20);
        supplies.addSupply(milk, 10);
        supplies.addSupply(chocolate, 10);

        return supplies;

    }

    private static Map<String, String[][]> getDataProduct() {

        Map<String, String[][]> mapOfProducts = new HashMap<>();

        String[][] latteRecipe = new String[3][7];


        latteRecipe[0][0] = "Latte Small";
        latteRecipe[0][1] = "coffee";
        latteRecipe[0][2] = "1";
        latteRecipe[0][3] = "water";
        latteRecipe[0][4] = "2";
        latteRecipe[0][5] = "milk";
        latteRecipe[0][6] = "1";

        latteRecipe[1][0] = "Latte Medium";
        latteRecipe[1][1] = "coffee";
        latteRecipe[1][2] = "2";
        latteRecipe[1][3] = "water";
        latteRecipe[1][4] = "3";
        latteRecipe[1][5] = "milk";
        latteRecipe[1][6] = "3";

        latteRecipe[2][0] = "Latte Large";
        latteRecipe[2][1] = "coffee";
        latteRecipe[2][2] = "3";
        latteRecipe[2][3] = "water";
        latteRecipe[2][4] = "4";
        latteRecipe[2][5] = "milk";
        latteRecipe[2][6] = "4";

        mapOfProducts.put("latte", latteRecipe);

        //-------------------------
        String[][] mockaRecipe = new String[3][9];

        mockaRecipe[0][0] = "Mocka Small";
        mockaRecipe[0][1] = "coffee";
        mockaRecipe[0][2] = "1";
        mockaRecipe[0][3] = "water";
        mockaRecipe[0][4] = "2";
        mockaRecipe[0][5] = "milk";
        mockaRecipe[0][6] = "1";
        mockaRecipe[0][7] = "chocolate";
        mockaRecipe[0][8] = "1";

        mockaRecipe[1][0] = "Mocka Medium";
        mockaRecipe[1][1] = "coffee";
        mockaRecipe[1][2] = "3";
        mockaRecipe[1][3] = "water";
        mockaRecipe[1][4] = "4";
        mockaRecipe[1][5] = "milk";
        mockaRecipe[1][6] = "1";
        mockaRecipe[1][7] = "chocolate";
        mockaRecipe[1][8] = "2";

        mockaRecipe[2][0] = "Mocka Large";
        mockaRecipe[2][1] = "coffee";
        mockaRecipe[2][2] = "1";
        mockaRecipe[2][3] = "water";
        mockaRecipe[2][4] = "5";
        mockaRecipe[2][5] = "milk";
        mockaRecipe[2][6] = "2";
        mockaRecipe[2][7] = "chocolate";
        mockaRecipe[2][8] = "2";

        mapOfProducts.put("mocka", mockaRecipe);

        //-----------------------

        String[][] classicRecipe = new String[3][5];


        classicRecipe[0][0] = "Classic Small";
        classicRecipe[0][1] = "coffee";
        classicRecipe[0][2] = "1";
        classicRecipe[0][3] = "water";
        classicRecipe[0][4] = "1";

        classicRecipe[1][0] = "Classic Medium";
        classicRecipe[1][1] = "coffee";
        classicRecipe[1][2] = "2";
        classicRecipe[1][3] = "water";
        classicRecipe[1][4] = "2";

        classicRecipe[2][0] = "Classic Large";
        classicRecipe[2][1] = "coffee";
        classicRecipe[2][2] = "3";
        classicRecipe[2][3] = "water";
        classicRecipe[2][4] = "3";

        mapOfProducts.put("classic", classicRecipe);

        return mapOfProducts;
    }


    private static List<Product> createProducts() {

        Map<String, String[][]> products = getDataProduct();

        Ingredient coffee = new Ingredient("coffee");
        Ingredient water = new Ingredient("water");
        Ingredient milk = new Ingredient("milk");
        Ingredient chocolate = new Ingredient("chocolate");
        List<Product> productsArr = new ArrayList<>();

        for (Map.Entry<String, String[][]> entry : products.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
            Product product = new Product(entry.getKey());
            String[][] values = entry.getValue();
            for (int i = 0; i < values.length; i++) {
                Recipe recipe = new Recipe(values[i][0]);
                for (int j = 1; j < values[i].length; j = j + 2) {
                    String ingredient =values[i][j];

                    if (ingredient.equals("coffee")) recipe.addIngredient(coffee, Integer.valueOf(values[i][j + 1]));
                    if (ingredient.equals("water")) recipe.addIngredient(water, Integer.valueOf(values[i][j + 1]));
                    if (ingredient.equals("milk")) recipe.addIngredient(milk, Integer.valueOf(values[i][j + 1]));
                    if (ingredient.equals("chocolate"))
                        recipe.addIngredient(chocolate, Integer.valueOf(values[i][j + 1]));

                }

                product.addRecipe(recipe);
            }
            productsArr.add(product);
        }


        return productsArr;
    }
}
