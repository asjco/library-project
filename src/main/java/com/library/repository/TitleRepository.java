package com.library.repository;

import com.library.tables.Titles;
import org.springframework.data.repository.CrudRepository;

public interface TitleRepository extends CrudRepository<Titles, Long> {
}
