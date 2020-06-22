package com.library.controller;

import com.library.mapper.MembersMapper;
import com.library.service.MembersDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/members")
public class MembersController {
    @Autowired
    private MembersDbService membersService;
    @Autowired
    private MembersMapper membersMapper;
    
}
