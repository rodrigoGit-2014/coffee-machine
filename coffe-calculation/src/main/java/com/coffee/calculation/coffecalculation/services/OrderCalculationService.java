package com.coffee.calculation.coffecalculation.services;

import com.coffee.calculation.coffecalculation.response.PrepareOrder;
import org.springframework.stereotype.Component;

@Component
public class OrderCalculationService {

    public PrepareOrder prepareOrder(){
        PrepareOrder prepareOrder = new PrepareOrder(true);
        return prepareOrder;
    }
}
