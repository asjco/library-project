package com.library.mapper;

import com.library.tables.Rental;
import com.library.tablesdto.RentalDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RentalsMapper {

    public Rental mapToRentals(final RentalDto rentalDto) {
        return new Rental(
                rentalDto.getId(),
                rentalDto.getReturnDate());
    }

    public RentalDto mapToRentalsDto(final Rental rental) {
        return new RentalDto(
                rental.getId(),
                rental.getReturnDate(),
                rental.getCopy().getSerialNumber(),
                rental.getMember().getId());
    }

    public List<RentalDto> mapToRentalsDtoList(final List<Rental> rentalsList) {
        return rentalsList.stream()
                .map(t -> mapToRentalsDto(t))
                .collect(Collectors.toList());
    }

}
