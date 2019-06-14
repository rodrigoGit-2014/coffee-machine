package com.coffee.calculation.coffecalculation.controller;

import com.coffee.calculation.coffecalculation.proxy.DBManagerProxy;
import com.coffee.calculation.coffecalculation.response.Dispenser;
import com.coffee.calculation.coffecalculation.response.DispenserResponse;
import com.coffee.calculation.coffecalculation.response.PrepareOrder;
import com.coffee.calculation.coffecalculation.services.OrderCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderCalculationController {

    @Autowired
    private DBManagerProxy dbManagerProxy;

    @GetMapping("/preparation/dispenser/{dispenserId}/recipe/{recipeId}")
    public Dispenser prepareOrder(@PathVariable int dispenserId, @PathVariable int recipeId) {
        Dispenser dispenserResponse =  dbManagerProxy.findDispenserById(dispenserId);
        return dispenserResponse;
    }


}
