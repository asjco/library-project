package com.library.controller;

import com.library.mapper.RentalsMapper;
import com.library.service.RentalsDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/rentals")
public class RentalsController {

    private RentalsDbService rentalsService;
    private RentalsMapper rentalsMapper;

    @Autowired
    public RentalsController(RentalsDbService rentalsService, RentalsMapper rentalsMapper) {
        this.rentalsService = rentalsService;
        this.rentalsMapper = rentalsMapper;
    }
}
