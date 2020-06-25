package com.library.repository;

import com.library.tables.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MembersRepository extends CrudRepository<Member, Long> {

    @Override
    Member save(Member member);

    @Override
    List<Member> findAll();

    Member findById(int id);

}
