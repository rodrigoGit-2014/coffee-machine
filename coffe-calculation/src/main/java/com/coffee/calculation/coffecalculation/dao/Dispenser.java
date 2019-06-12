package com.coffee.calculation.coffecalculation.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dispenser {

    @Id
    private int id_dispenser;
    private String name;
    private String address;

    public int getId_dispenser() {
        return id_dispenser;
    }

    public void setId_dispenser(int id_dispenser) {
        this.id_dispenser = id_dispenser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
