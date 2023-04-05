package com.example.controls.services;

import com.example.controls.models.User;
import com.example.controls.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User addNewUser(User user){
        userRepository.save(user);
        return user;
    }

}
