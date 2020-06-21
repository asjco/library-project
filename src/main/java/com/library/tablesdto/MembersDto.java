package com.library.tablesdto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class MembersDto {

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate accountCreateDate;
}
