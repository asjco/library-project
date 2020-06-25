package com.library.mapper;

import com.library.tables.Member;
import com.library.tablesdto.MemberDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MembersMapper {

    public Member mapToMembers(final MemberDto memberDto) {
        return new Member(
                memberDto.getId(),
                memberDto.getFirstName(),
                memberDto.getLastName(),
                memberDto.getAccountCreateDate());
    }

    public MemberDto mapToMembersDto(final Member member) {
        return new MemberDto(
                member.getId(),
                member.getFirstName(),
                member.getLastName(),
                member.getAccountCreateDate());
    }

    public List<MemberDto> mapToMembersDtoList(final List<Member> membersList) {
        return membersList.stream()
                .map(t -> new MemberDto(t.getId(), t.getFirstName(), t.getLastName(), t.getAccountCreateDate()))
                .collect(Collectors.toList());
    }
}
