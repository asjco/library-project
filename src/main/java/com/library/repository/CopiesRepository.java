package com.library.repository;

import com.library.tables.Copies;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CopiesRepository extends CrudRepository<Copies, Long> {

    @Override
    List<Copies> findAll();

    @Override
    Copies save(Copies copy);

    List<Copies> findAllByStatus(Copies.Status status);

}
