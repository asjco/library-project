package com.library.mapper;

import com.library.tables.Members;
import com.library.tablesdto.MembersDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MembersMapper {

    public Members mapToMembers(final MembersDto membersDto) {
        return new Members(
                membersDto.getId(),
                membersDto.getFirstName(),
                membersDto.getLastName(),
                membersDto.getAccountCreateDate());
    }

    public MembersDto mapToMembersDto(final Members members) {
        return new MembersDto(
                members.getId(),
                members.getFirstName(),
                members.getLastName(),
                members.getAccountCreateDate());
    }

    public List<MembersDto> mapToMembersDtoList(final List<Members> membersList) {
        return membersList.stream()
                .map(t -> new MembersDto(t.getId(), t.getFirstName(), t.getLastName(), t.getAccountCreateDate()))
                .collect(Collectors.toList());
    }
}
