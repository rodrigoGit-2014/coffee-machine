package com.coffee.calculation.coffecalculation.repository;

import com.coffee.calculation.coffecalculation.dao.Dispenser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispenserRepository extends CrudRepository<Dispenser, Integer> {
}
