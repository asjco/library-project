package com.library.repository;

import com.library.tables.Members;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MembersRepository extends CrudRepository<Members, Long> {

    @Override
    Members save(Members member);

    @Override
    List<Members> findAll();

}
