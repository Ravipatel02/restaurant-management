package com.masai.authapi.services;

import org.springframework.stereotype.Service;

import com.masai.authapi.entities.User;
import com.masai.authapi.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {
        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);

        return users;
    }
}
