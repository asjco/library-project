package com.library.tablesdto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class RentalDto {

    private int id;
    private LocalDate returnDate;
    private int copyId;
    private int memberId;

}
