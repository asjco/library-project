package com.library.service;

import com.library.repository.MembersRepository;
import com.library.tables.Members;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembersDbService {

    @Autowired
    private MembersRepository membersRepository;

    public List<Members> getAllMembers(){
        return membersRepository.findAll();
    }

    public void saveMember(final Members member){
        membersRepository.save(member);
    }
}
