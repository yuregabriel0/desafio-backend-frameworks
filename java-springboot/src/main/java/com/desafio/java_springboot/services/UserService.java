package com.desafio.javaspringboot.services;

import com.desafio.javaspringboot.models.UserModel;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserModel getUser() {
        return new UserModel(1L, "John Doe", "john@example.com");
    }
}