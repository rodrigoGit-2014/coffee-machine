package com.coffee.calculation.coffecalculation.proxy;

import com.coffee.calculation.coffecalculation.response.Dispenser;
import com.coffee.calculation.coffecalculation.response.DispenserResponse;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "dbmanager")
@RibbonClient(name = "dbmanager")
public interface DBManagerProxy {
    @GetMapping("/dispensers")
    DispenserResponse findAllDispenser();

    @GetMapping("/dispenser/{id}")
    Dispenser findDispenserById(@PathVariable("id") Integer id);
}
