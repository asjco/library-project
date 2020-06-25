package com.library.controller;

import com.library.service.RentalsDbService;
import com.library.tablesdto.RentalDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/rentals")
public class RentalsController {

    private RentalsDbService rentalsService;

    public RentalsController(RentalsDbService rentalsService) {
        this.rentalsService = rentalsService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "createRental", consumes = APPLICATION_JSON_VALUE)
    public void createRental(@RequestBody RentalDto rentalDto){
        rentalsService.saveRental(rentalDto);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getRentals")
    public List<RentalDto> getRentals(){
        return rentalsService.getAllRentals();
    }
}
