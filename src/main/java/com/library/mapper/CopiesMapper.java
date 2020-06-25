package com.library.mapper;

import com.library.tables.Copy;
import com.library.tablesdto.CopyDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CopiesMapper {

    public Copy mapToCopies(final CopyDto copyDto) {
        return new Copy(
                copyDto.getSerialNumber(),
                copyDto.getStatus());
    }

    public CopyDto mapToCopiesDto(final Copy copy) {
        return new CopyDto(
                copy.getSerialNumber(),
                copy.getStatus(),
                copy.getTitle().getId());
    }

    public List<CopyDto> mapToCopiesDtoList(final List<Copy> copiesList) {
        return copiesList.stream()
                .map(t -> mapToCopiesDto(t))
                .collect(Collectors.toList());
    }

}
