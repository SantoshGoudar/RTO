package com.example.RTO.dao.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;
import java.util.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "User",schema = "Test")
public class User {
    @Id
    @GeneratedValue(generator = "system-uuid")
    UUID id;
    String name;
    String email;
    @NaturalId
    String phoneNumber;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    @EqualsAndHashCode.Exclude
    Set<Vehicle> vehicles;

}
