package com.library.controller;

import com.library.mapper.CopiesMapper;
import com.library.service.CopiesDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/copies")
public class CopiesController {
    @Autowired
    private CopiesDbService copiesService;
    @Autowired
    private CopiesMapper copiesMapper;

}
