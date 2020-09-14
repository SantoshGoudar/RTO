package com.example.RTO.dao.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Vehicle", schema = "Test")
public class Vehicle {
    String vehicleType;
    String make;
    String model;
    String color;
    String engineNumber;
    String chassisNumber;
    @Id
    String registrationNumber;
}
