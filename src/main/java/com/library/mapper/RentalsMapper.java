package com.library.mapper;

import com.library.tables.Rentals;
import com.library.tablesdto.RentalsDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RentalsMapper {

    public Rentals mapToRentals(final RentalsDto rentalsDto) {
        return new Rentals(
                rentalsDto.getId(),
                rentalsDto.getBorrowDate(),
                rentalsDto.getReturnDate());
    }

    public RentalsDto mapToRentalsDto(final Rentals rentals) {
        return new RentalsDto(
                rentals.getId(),
                rentals.getBorrowDate(),
                rentals.getReturnDate());
    }

    public List<RentalsDto> mapToRentalsDtoList(final List<Rentals> rentalsList) {
        return rentalsList.stream()
                .map(t -> new RentalsDto(t.getId(), t.getBorrowDate(), t.getReturnDate()))
                .collect(Collectors.toList());
    }

}
