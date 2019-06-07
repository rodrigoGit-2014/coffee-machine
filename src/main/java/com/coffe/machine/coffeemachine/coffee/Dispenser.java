package com.coffe.machine.coffeemachine.coffee;

import java.util.ArrayList;
import java.util.List;

public class Dispenser {

    private int id;

    private List<Supply> supplies;

    private List<Product> products;


    public Dispenser(int id) {
        this.id = id;
        supplies = new ArrayList<>();
        products = new ArrayList<>();
    }

    public void addSupply(Supply supply) {
        supplies.add(supply);
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
