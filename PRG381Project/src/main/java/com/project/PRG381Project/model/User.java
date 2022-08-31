package com.project.PRG381Project.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {
    private final UUID id;
    private final String name;
    private final String address;
    private final String email;
    private final String password;


    public User(@JsonProperty("id") UUID id,
                @JsonProperty("name") String name,
                @JsonProperty("address") String address,
                @JsonProperty("email") String email,
                @JsonProperty("password") String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public UUID getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
}
