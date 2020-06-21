package com.library.service;

import com.library.repository.TitlesRepository;
import com.library.tables.Titles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitlesDbService {

    @Autowired
    private TitlesRepository titlesRepository;

    public List<Titles> getAllTitles(){
        return titlesRepository.findAll();
    }

    public void saveTitle(final Titles title){
        titlesRepository.save(title);
    }
}
