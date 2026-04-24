package com.desafio.javaspringboot.controllers;

import com.desafio.javaspringboot.models.UserModel;
import com.desafio.javaspringboot.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public UserModel getUser() {
        return userService.getUser();
    }
}