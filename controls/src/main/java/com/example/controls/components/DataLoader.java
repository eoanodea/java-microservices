package com.example.controls.components;

import com.example.controls.models.User;
import com.example.controls.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserService userService;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User();
        user.setName("Eoan");
        user.setEmail("eoan@eoan.ie");

        userService.addNewUser(user);
    }
}