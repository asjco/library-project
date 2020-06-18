package com.library.repository;

import com.library.tables.Members;
import org.springframework.data.repository.CrudRepository;

public interface MembersRepository extends CrudRepository<Members, Long> {
}
