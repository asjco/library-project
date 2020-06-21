package com.library.service;

import com.library.repository.RentalsRepository;
import com.library.tables.Rentals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalsDbService {

    @Autowired
    private RentalsRepository rentalsRepository;

    public List<Rentals> getAllRentals(){
        return rentalsRepository.findAll();
    }

    public void saveRental(final Rentals rental){
        rentalsRepository.save(rental);
    }

    public void deleteRentalById(final Long id){
        rentalsRepository.deleteById(id);
    }
}
