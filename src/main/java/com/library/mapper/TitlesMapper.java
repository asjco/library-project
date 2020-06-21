package com.library.mapper;

import com.library.tables.Titles;
import com.library.tablesdto.TitlesDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TitlesMapper {

    public Titles mapToTitles(final TitlesDto titlesDto) {
        return new Titles(
                titlesDto.getId(),
                titlesDto.getTitle(),
                titlesDto.getAuthor(),
                titlesDto.getYearOfPublication());
    }

    public TitlesDto mapToTitlesDto(final Titles titles) {
        return new TitlesDto(
                titles.getId(),
                titles.getTitle(),
                titles.getAuthor(),
                titles.getYearOfPublication());
    }

    public List<TitlesDto> mapToTitlesDtoList(final List<Titles> titlesList) {
        return titlesList.stream()
                .map(t -> new TitlesDto(t.getId(), t.getTitle(), t.getAuthor(), t.getYearOfPublication()))
                .collect(Collectors.toList());
    }
}

