package com.library.service;

import com.library.mapper.TitlesMapper;
import com.library.repository.TitlesRepository;
import com.library.tables.Title;
import com.library.tablesdto.TitleDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitlesDbService {


    private TitlesRepository titlesRepository;
    private TitlesMapper titlesMapper;

    public TitlesDbService(TitlesRepository titlesRepository, TitlesMapper titlesMapper) {
        this.titlesRepository = titlesRepository;
        this.titlesMapper = titlesMapper;
    }

    public List<TitleDto> getAllTitles(){
        return titlesMapper.mapToTitlesDtoList(titlesRepository.findAll());
    }

    public void saveTitle(final TitleDto titleDto){
        titlesRepository.save(titlesMapper.mapToTitles(titleDto));
    }

    public void deleteAll(){
        titlesRepository.deleteAll();
    }
}
