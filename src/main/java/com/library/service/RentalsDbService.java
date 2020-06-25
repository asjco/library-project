package com.library.service;

import com.library.mapper.RentalsMapper;
import com.library.repository.RentalsRepository;
import com.library.tables.Rental;
import com.library.tablesdto.RentalDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalsDbService {

    private RentalsRepository rentalsRepository;
    private RentalsMapper rentalsMapper;

    public RentalsDbService(RentalsRepository rentalsRepository, RentalsMapper rentalsMapper) {
        this.rentalsRepository = rentalsRepository;
        this.rentalsMapper = rentalsMapper;
    }

    public List<RentalDto> getAllRentals(){
        return rentalsMapper.mapToRentalsDtoList(rentalsRepository.findAll());
    }

    public void saveRental(final RentalDto rentalDto){
        rentalsRepository.save(rentalsMapper.mapToRentals(rentalDto));
    }

    public void deleteRentalById(final Long id){
        rentalsRepository.deleteById(id);
    }
}
