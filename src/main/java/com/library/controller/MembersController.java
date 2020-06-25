package com.library.controller;

import com.library.mapper.MembersMapper;
import com.library.service.MembersDbService;
import com.library.tablesdto.MemberDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/members")
public class MembersController {

    private MembersDbService membersService;
    private MembersMapper membersMapper;

    public MembersController(MembersDbService membersService, MembersMapper membersMapper) {
        this.membersService = membersService;
        this.membersMapper = membersMapper;
    }

    @RequestMapping(method = RequestMethod.POST, value = "createMember", consumes = APPLICATION_JSON_VALUE)
    public void createMember(@RequestBody MemberDto memberDto){
        membersService.saveMember(memberDto);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getMembers")
    public List<MemberDto> getMembers(){
        return membersService.getAllMembers();
}
}
