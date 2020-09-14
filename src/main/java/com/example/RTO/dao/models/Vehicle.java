package com.example.RTO.dao.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.NaturalId;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Vehicle",schema = "Test")
public class Vehicle {
    @GeneratedValue(generator = "system-uuid")
    @Id
    UUID id;
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
    @NaturalId
    String registrationNumber;
}
