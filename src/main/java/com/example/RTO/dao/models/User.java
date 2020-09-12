package com.example.RTO.dao.models;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    String name;
    String email;
    String phonenumber;
    Set<Vehicle> vehicles;

    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phonenumber = phoneNumber;
    }
}
