package com.desafio.javaspringboot.models;

public class UserModel {
    private Long id;
    private String name;
    private String email;

    public UserModel(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}