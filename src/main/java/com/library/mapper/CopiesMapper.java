package com.library.mapper;

import com.library.tables.Copies;
import com.library.tablesdto.CopiesDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CopiesMapper {

    public Copies mapToCopies(final CopiesDto copiesDto) {
        return new Copies(
                copiesDto.getSerialNumber(),
                copiesDto.getStatus());
    }

    public CopiesDto mapToCopiesDto(final Copies copies) {
        return new CopiesDto(
                copies.getSerialNumber(),
                copies.getStatus());
    }

    public List<CopiesDto> mapToCopiesDtoList(final List<Copies> copiesList) {
        return copiesList.stream()
                .map(t -> new CopiesDto(t.getSerialNumber(), t.getStatus()))
                .collect(Collectors.toList());
    }

}
