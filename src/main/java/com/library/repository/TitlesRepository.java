package com.library.repository;

import com.library.tables.Title;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TitlesRepository extends CrudRepository<Title, Long> {

    @Override
    Title save(Title title);

    @Override
    List<Title> findAll();

    @Override
    void deleteAll();

    Title findById(int id);
}
