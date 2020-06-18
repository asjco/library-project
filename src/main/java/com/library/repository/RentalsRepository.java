package com.library.repository;

import com.library.tables.Rentals;
import org.springframework.data.repository.CrudRepository;

public interface RentalsRepository extends CrudRepository<Rentals, Long> {
}
