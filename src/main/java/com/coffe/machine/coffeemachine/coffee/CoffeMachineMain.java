package com.coffe.machine.coffeemachine.coffee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoffeMachineMain {

    public static void main(String[] args) {

        Map<String, String[][]> data = getDataProduct();
        List<Product> products = createProducts(data);


        //defining ingredients
        Ingredient coffee = new Ingredient("coffee");
        Ingredient water = new Ingredient("water");
        Ingredient milk = new Ingredient("milk");
        Ingredient chocolate = new Ingredient("chocolate");


        //defining product configuration
        Product latte = new Product("latte");

        Recipe latteSmall = new Recipe("Latte Small");
        latteSmall.addIngredient(coffee, 1);
        latteSmall.addIngredient(water, 2);
        latteSmall.addIngredient(milk, 1);

        Recipe latteMedium = new Recipe("Latte Medium");
        latteMedium.addIngredient(coffee, 2);
        latteMedium.addIngredient(water, 3);
        latteMedium.addIngredient(milk, 3);

        Recipe latteLarge = new Recipe("Latte Large");
        latteLarge.addIngredient(coffee, 3);
        latteLarge.addIngredient(water, 4);
        latteLarge.addIngredient(milk, 4);

        latte.addRecipe(latteSmall);
        latte.addRecipe(latteMedium);
        latte.addRecipe(latteLarge);

        //defining supplies configuration
        Supply supplies = new Supply();
        supplies.addSupply(coffee, 10);
        supplies.addSupply(water, 20);
        supplies.addSupply(milk, 10);
        supplies.addSupply(chocolate, 10);


        //Defining dispenser

        Dispenser dispenserOne = new Dispenser(1);

    }

    private static Map<String, String[][]> getDataProduct() {

        Map<String, String[][]> mapOfProducts = new HashMap<>();

        String[][] latteRecipe = new String[3][7];


        latteRecipe[0][0] = "Latte Small";
        latteRecipe[0][1] = "coffe";
        latteRecipe[0][2] = "1";
        latteRecipe[0][3] = "water";
        latteRecipe[0][4] = "2";
        latteRecipe[0][5] = "milk";
        latteRecipe[0][6] = "1";

        latteRecipe[1][0] = "Latte Medium";
        latteRecipe[1][1] = "coffe";
        latteRecipe[1][2] = "2";
        latteRecipe[1][3] = "water";
        latteRecipe[1][4] = "3";
        latteRecipe[1][5] = "milk";
        latteRecipe[1][6] = "3";

        latteRecipe[2][0] = "Latte Large";
        latteRecipe[2][1] = "coffe";
        latteRecipe[2][2] = "3";
        latteRecipe[2][3] = "water";
        latteRecipe[2][4] = "4";
        latteRecipe[2][5] = "milk";
        latteRecipe[2][6] = "4";

        mapOfProducts.put("latte", latteRecipe);

        //-------------------------
        String[][] mockaRecipe = new String[3][10];

        mockaRecipe[0][1] = "Mocka Small";
        mockaRecipe[0][2] = "coffe";
        mockaRecipe[0][3] = "1";
        mockaRecipe[0][4] = "water";
        mockaRecipe[0][5] = "2";
        mockaRecipe[0][6] = "milk";
        mockaRecipe[0][7] = "1";
        mockaRecipe[0][8] = "chocolate";
        mockaRecipe[0][9] = "1";

        mockaRecipe[1][1] = "Mocka Medium";
        mockaRecipe[1][2] = "coffe";
        mockaRecipe[1][3] = "3";
        mockaRecipe[1][4] = "water";
        mockaRecipe[1][5] = "4";
        mockaRecipe[1][6] = "milk";
        mockaRecipe[1][7] = "1";
        mockaRecipe[1][8] = "chocolate";
        mockaRecipe[1][9] = "2";

        mockaRecipe[2][1] = "Mocka Large";
        mockaRecipe[2][2] = "coffe";
        mockaRecipe[2][3] = "1";
        mockaRecipe[2][4] = "water";
        mockaRecipe[2][5] = "5";
        mockaRecipe[2][6] = "milk";
        mockaRecipe[2][7] = "2";
        mockaRecipe[2][8] = "chocolate";
        mockaRecipe[2][9] = "2";

        mapOfProducts.put("mocka", mockaRecipe);

        //-----------------------

        String[][] classicRecipe = new String[3][10];


        classicRecipe[0][0] = "Classic Small";
        classicRecipe[0][1] = "coffe";
        classicRecipe[0][2] = "1";
        classicRecipe[0][3] = "water";
        classicRecipe[0][4] = "1";

        classicRecipe[1][0] = "Classic Medium";
        classicRecipe[1][1] = "coffe";
        classicRecipe[1][2] = "2";
        classicRecipe[1][3] = "water";
        classicRecipe[1][4] = "2";

        classicRecipe[2][0] = "Classic Large";
        classicRecipe[2][1] = "coffe";
        classicRecipe[2][2] = "3";
        classicRecipe[2][3] = "water";
        classicRecipe[2][4] = "3";

        mapOfProducts.put("classic", classicRecipe);

        return mapOfProducts;
    }


    private static List<Product> createProducts(Map<String, String[][]> products) {

        Ingredient coffee = new Ingredient("coffee");
        Ingredient water = new Ingredient("water");
        Ingredient milk = new Ingredient("milk");
        Ingredient chocolate = new Ingredient("chocolate");
        List<Product> productsArr = new ArrayList<>();

        for (Map.Entry<String, String[][]> entry : products.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
            Product product = new Product(entry.getKey());
            String[] values = new String[entry.getValue().length];
            for (int i=0;i<values.length;i++){
                
            }
        }

        /*
        for (int i = 0; i < products.length; i++) {
            Product product = new Product(products[i][0]);
            Recipe recipe = new Recipe(products[i][1]);
            for (int j = 1; j < products[i].length; j++) {
                String ingredient = products[i][j];
                if (ingredient.equals("coffee")) recipe.addIngredient(coffee, Integer.valueOf(products[i][j++]));
                if (ingredient.equals("water")) recipe.addIngredient(water, Integer.valueOf(products[i][j++]));
                if (ingredient.equals("milk")) recipe.addIngredient(milk, Integer.valueOf(products[i][j++]));
                if (ingredient.equals("chocolate")) recipe.addIngredient(chocolate, Integer.valueOf(products[i][j++]));
            }
            product.addRecipe(recipe);
            productsArr.add(product);

        }*/

        return productsArr;
    }
}
