package com.library.repository;

import com.library.tables.Rental;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RentalsRepository extends CrudRepository<Rental, Long> {

    @Override
    List<Rental> findAll();

    @Override
    Rental save(Rental rental);

    @Override
    void deleteById(Long id);
}
