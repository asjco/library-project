package com.library.service;

import com.library.mapper.MembersMapper;
import com.library.repository.MembersRepository;
import com.library.tables.Member;
import com.library.tablesdto.MemberDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembersDbService {

    private MembersRepository membersRepository;
    private MembersMapper membersMapper;

    public MembersDbService(MembersRepository membersRepository, MembersMapper membersMapper) {
        this.membersRepository = membersRepository;
        this.membersMapper = membersMapper;
    }

    public List<MemberDto> getAllMembers(){
        return membersMapper.mapToMembersDtoList(membersRepository.findAll());
    }

    public void saveMember(final MemberDto memberDto){
        membersRepository.save(membersMapper.mapToMembers(memberDto));
    }
}
