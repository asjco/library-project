package com.library.tablesdto;

import com.library.tables.Copies;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CopiesDto {

    private int serialNumber;
    private Copies.Status status;
}
