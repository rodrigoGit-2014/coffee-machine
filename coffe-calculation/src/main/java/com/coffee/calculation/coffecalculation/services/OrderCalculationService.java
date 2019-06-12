package com.coffee.calculation.coffecalculation.services;

import com.coffee.calculation.coffecalculation.dao.Dispenser;
import com.coffee.calculation.coffecalculation.repository.DispenserRepository;
import com.coffee.calculation.coffecalculation.response.PrepareOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderCalculationService {

    @Autowired
    private DispenserRepository dispenserRepository;

    public List<Dispenser> getAllDispenser(){
        List<Dispenser> dispensers = new ArrayList<>();
        dispenserRepository.findAll().forEach(dispenser -> dispensers.add(dispenser));
        return dispensers;
    }

    public PrepareOrder prepareOrder(){
        PrepareOrder prepareOrder = new PrepareOrder(true);
        return prepareOrder;
    }
}
