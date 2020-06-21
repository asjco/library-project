package com.library.repository;

import com.library.tables.Rentals;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RentalsRepository extends CrudRepository<Rentals, Long> {

    @Override
    List<Rentals> findAll();

    @Override
    Rentals save(Rentals rental);

    @Override
    void deleteById(Long id);
}
