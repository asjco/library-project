package com.library.controller;

import com.library.mapper.TitlesMapper;
import com.library.service.TitlesDbService;
import com.library.tablesdto.TitlesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/titles")
public class TitlesController {

    private TitlesDbService titlesService;
    private TitlesMapper titlesMapper;

    @Autowired
    public TitlesController(TitlesDbService titlesService, TitlesMapper titlesMapper) {
        this.titlesService = titlesService;
        this.titlesMapper = titlesMapper;
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTitle", consumes = APPLICATION_JSON_VALUE)
    public void createTitle(@RequestBody TitlesDto titlesDto){
        titlesService.saveTitle(titlesMapper.mapToTitles(titlesDto));
    }

    @RequestMapping(method = RequestMethod.GET, value = "getTitles")
    public List<TitlesDto> getAllTitles() {
        return titlesMapper.mapToTitlesDtoList(titlesService.getAllTitles());
    }

}
