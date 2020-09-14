package com.example.RTO.dao.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "User", schema = "Test")
public class User {
    String name;
    String email;
    @Id
    String phoneNumber;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    @EqualsAndHashCode.Exclude
    Set<Vehicle> vehicles;

}
