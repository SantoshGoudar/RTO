package com.example.RTO.dao.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Vehicle", schema = "Test")
public class Vehicle {
    @ManyToOne
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    User owner;
    String vehicleType;
    String make;
    String model;
    String color;
    String engineNumber;
    String chassisNumber;
    @Id
    String registrationNumber;
}
