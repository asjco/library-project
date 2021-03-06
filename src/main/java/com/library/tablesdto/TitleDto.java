package com.library.tablesdto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Year;

@Getter
@AllArgsConstructor
public class TitleDto {

    private int id;
    private String title;
    private String author;
    private Year yearOfPublication;
}
