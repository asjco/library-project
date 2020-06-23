package com.library.service;

import com.library.repository.CopiesRepository;
import com.library.tables.Copies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CopiesDbService {

    @Autowired
   private CopiesRepository copiesRepository;

    public List<Copies> getAllCopies(){
        return copiesRepository.findAll();
    }

    public  List<Copies> getAllByStatus(final String status){
       return copiesRepository.findAllByStatus(status);
    }

    public void saveCopy(final Copies copy){
        copiesRepository.save(copy);
    }


}
