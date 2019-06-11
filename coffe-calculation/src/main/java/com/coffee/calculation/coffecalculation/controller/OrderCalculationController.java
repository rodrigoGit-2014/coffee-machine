package com.coffee.calculation.coffecalculation.controller;

import com.coffee.calculation.coffecalculation.response.PrepareOrder;
import com.coffee.calculation.coffecalculation.services.OrderCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderCalculationController {

    @Autowired
    private OrderCalculationService orderCalculationService;

    @GetMapping("/preparation/dispenser/{dispenserId}/recipe/{recipeId}")
    public PrepareOrder prepareOrder(@PathVariable int dispenserId, @PathVariable int recipeId) {
        return orderCalculationService.prepareOrder();
    }
}
