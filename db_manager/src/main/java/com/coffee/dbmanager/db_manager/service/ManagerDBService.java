package com.coffee.dbmanager.db_manager.service;

import com.coffee.dbmanager.db_manager.dto.Dispenser;
import com.coffee.dbmanager.db_manager.repository.DispenserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManagerDBService {

    @Autowired
    private DispenserRepository dispenserRepository;


    public List<Dispenser> findAllDispenser(){
        List<Dispenser> dispensers = new ArrayList<>();
        dispenserRepository.findAll().forEach(dispenser -> dispensers.add(dispenser));
        return dispensers;
    }

    public Dispenser findDispenserById(int id){
       Dispenser dispenser =  dispenserRepository.findById(id);
       return dispenser;
    }

}
