package com.example.pricing.components;

import com.example.pricing.models.Price;
import com.example.pricing.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PriceService priceService;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Price price = new Price();
        price.setName("Main Service");

        priceService.addNewPrice(price);
    }
}
