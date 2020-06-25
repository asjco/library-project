package com.library.mapper;

import com.library.tables.Title;
import com.library.tablesdto.TitleDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TitlesMapper {

    public Title mapToTitles(final TitleDto titleDto) {
        return new Title(
                titleDto.getId(),
                titleDto.getTitle(),
                titleDto.getAuthor(),
                titleDto.getYearOfPublication());
    }

    public TitleDto mapToTitlesDto(final Title title) {
        return new TitleDto(
                title.getId(),
                title.getTitle(),
                title.getAuthor(),
                title.getYearOfPublication());
    }

    public List<TitleDto> mapToTitlesDtoList(final List<Title> titlesList) {
        return titlesList.stream()
                .map(t -> new TitleDto(t.getId(), t.getTitle(), t.getAuthor(), t.getYearOfPublication()))
                .collect(Collectors.toList());
    }
}

