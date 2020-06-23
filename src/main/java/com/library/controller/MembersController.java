package com.library.controller;

import com.library.mapper.MembersMapper;
import com.library.service.MembersDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/members")
public class MembersController {

    private MembersDbService membersService;
    private MembersMapper membersMapper;

    @Autowired
    public MembersController(MembersDbService membersService, MembersMapper membersMapper) {
        this.membersService = membersService;
        this.membersMapper = membersMapper;
    }
}
