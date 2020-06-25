package com.library.controller;

import com.library.service.TitlesDbService;
import com.library.tablesdto.TitleDto;
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

    public TitlesController(TitlesDbService titlesService) {
        this.titlesService = titlesService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTitle", consumes = APPLICATION_JSON_VALUE)
    public void createTitle(@RequestBody TitleDto titleDto){
        titlesService.saveTitle(titleDto);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getTitles")
    public List<TitleDto> getAllTitles() {
        return titlesService.getAllTitles();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteAll")
    public void deleteAll(){
        titlesService.deleteAll();
    }
}
