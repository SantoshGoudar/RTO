package com.example.RTO.dao.requests;

import lombok.Data;

@Data
public class VehicleRequest {
    String vehicleType;
    String make;
    String model;
    String color;
    String engineNumber;
    String chassisNumber;
    String registrationNumber;
}
