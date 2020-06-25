package com.library.controller;

import com.library.mapper.CopiesMapper;
import com.library.service.CopiesDbService;
import com.library.tablesdto.CopyDto;
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

    public CopiesController(CopiesDbService copiesService, CopiesMapper copiesMapper) {
        this.copiesService = copiesService;
        this.copiesMapper = copiesMapper;
    }

    @RequestMapping(method = RequestMethod.POST, value = "createCopy", consumes = APPLICATION_JSON_VALUE)
    public void createCopy(@RequestBody CopyDto copyDto) {
        copiesService.saveCopy(copyDto, copyDto.getTitleId());

    }

    @RequestMapping(method = RequestMethod.GET, value = "getCopies")
    public List<CopyDto> getCopies() {
        return copiesService.getAllCopies();
    }


}
