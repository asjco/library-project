package com.library.tablesdto;

import com.library.tables.Copies;
import com.library.tables.Members;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class RentalsDto {

    private int id;
    private LocalDate borrowDate;
    private LocalDate returnDate;

}
