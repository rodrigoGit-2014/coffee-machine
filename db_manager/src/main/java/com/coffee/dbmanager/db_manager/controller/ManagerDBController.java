package com.coffee.dbmanager.db_manager.controller;

import com.coffee.dbmanager.db_manager.dto.Dispenser;
import com.coffee.dbmanager.db_manager.dto.DispenserResponse;
import com.coffee.dbmanager.db_manager.service.ManagerDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerDBController {

    @Autowired
    private ManagerDBService managerDBService;

    @Value("${server.port}")
    int port;

    @GetMapping("/dispensers")
    public DispenserResponse findAllDispenser() {
        DispenserResponse dispenserResponse = new DispenserResponse();
        dispenserResponse.setDispensers(managerDBService.findAllDispenser());
        dispenserResponse.setPort(port);
        return dispenserResponse;
    }

    @GetMapping("/dispenser/{id}")
    public Dispenser findDispenserById(@PathVariable Integer id){
        return managerDBService.findDispenserById(id);
    }

}
