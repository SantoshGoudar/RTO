package com.example.RTO.dao.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Vehicle {
    String owner;
    String vehicletype;
    String make;
    String model;
    String color;
    String enginenumber;
    String chassisnumber;
    String registrationnumber;
}
