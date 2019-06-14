package com.coffee.dbmanager.db_manager.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dispenser {
    @Id
    private Integer id_dispenser;
    private String name;
    private String address;

    public Integer getId_dispenser() {
        return id_dispenser;
    }

    public void setId_dispenser(Integer id_dispenser) {
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
