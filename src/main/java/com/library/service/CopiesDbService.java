package com.library.service;

import com.library.mapper.CopiesMapper;
import com.library.repository.CopiesRepository;
import com.library.repository.TitlesRepository;
import com.library.tables.Title;
import com.library.tablesdto.CopyDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CopiesDbService {

    private CopiesRepository copiesRepository;
    private CopiesMapper copiesMapper;
    private TitlesRepository titlesRepository;

    public CopiesDbService(CopiesRepository copiesRepository, CopiesMapper copiesMapper, TitlesRepository titlesRepository) {
        this.copiesRepository = copiesRepository;
        this.copiesMapper = copiesMapper;
        this.titlesRepository = titlesRepository;
    }

    public List<CopyDto> getAllCopies() {
        return copiesMapper.mapToCopiesDtoList(copiesRepository.findAll());
    }

    public List<CopyDto> getAllByStatus(final String status) {
        return copiesMapper.mapToCopiesDtoList(copiesRepository.findAllByStatus(status));
    }

    public void saveCopy(final CopyDto copyDto, int titleId) {
        Title title = titlesRepository.findById(titleId);
        copiesMapper.mapToCopies(copyDto).setTitle(title);
        copiesRepository.save(copiesMapper.mapToCopies(copyDto));
    }


}
