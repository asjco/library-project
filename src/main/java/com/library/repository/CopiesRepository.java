package com.library.repository;

import com.library.tables.Copy;
import com.library.tables.Title;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CopiesRepository extends CrudRepository<Copy, Long> {

    @Override
    List<Copy> findAll();

    @Override
    Copy save(Copy copy);

    List<Copy> findAllByStatus(String status);

    Copy findBySerialNumber(int serialNumber);

}
