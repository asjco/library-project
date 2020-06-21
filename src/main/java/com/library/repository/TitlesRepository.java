package com.library.repository;

import com.library.tables.Titles;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TitlesRepository extends CrudRepository<Titles, Long> {

    @Override
    Titles save(Titles title);

    @Override
    List<Titles> findAll();
}
