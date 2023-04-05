package com.example.pricing.controllers;

import com.example.pricing.models.Price;
import com.example.pricing.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/prices")
public class PriceController {

    @Autowired
    PriceService priceService;

    @GetMapping
    public ResponseEntity<List<Price>> getAllPrices() {

        List<Price> prices = priceService.getAllPrices();
        return new ResponseEntity<>(prices, HttpStatus.OK);
    }
}
