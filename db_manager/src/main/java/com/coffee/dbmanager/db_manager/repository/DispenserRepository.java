package com.coffee.dbmanager.db_manager.repository;

import com.coffee.dbmanager.db_manager.dto.Dispenser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispenserRepository extends CrudRepository<Dispenser,Integer> {

    Dispenser findById(int id);
}
