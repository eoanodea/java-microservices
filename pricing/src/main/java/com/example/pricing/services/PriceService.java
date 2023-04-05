package com.example.pricing.services;

import com.example.pricing.models.Price;
import com.example.pricing.repositories.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    @Autowired
    PriceRepository priceRepository;

    public List<Price> getAllPrices() {
        return priceRepository.findAll();
    }

    public Price addNewPrice(Price price){
        priceRepository.save(price);
        return price;
    }
}
