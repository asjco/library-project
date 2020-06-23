package com.library.controller;

import com.library.mapper.CopiesMapper;
import com.library.service.CopiesDbService;
import com.library.tables.Copies;
import com.library.tables.Titles;
import com.library.tablesdto.CopiesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/copies")
public class CopiesController {

    private CopiesDbService copiesService;
    private CopiesMapper copiesMapper;

    @Autowired
    public CopiesController(CopiesDbService copiesService, CopiesMapper copiesMapper) {
        this.copiesService = copiesService;
        this.copiesMapper = copiesMapper;
    }

    @RequestMapping(method = RequestMethod.POST, value = "createCopy", consumes = APPLICATION_JSON_VALUE)
    public void createCopy(@RequestBody CopiesDto copiesDto) {
        copiesService.saveCopy(copiesMapper.mapToCopies(copiesDto));
    }

    @RequestMapping(method = RequestMethod.GET, value = "getCopies")
    public List<CopiesDto> getCopies() {
        return copiesMapper.mapToCopiesDtoList(copiesService.getAllCopies());
    }
}
