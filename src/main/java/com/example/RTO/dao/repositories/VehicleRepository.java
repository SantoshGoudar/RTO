package com.example.RTO.dao.repositories;

import java.util.UUID;
import com.example.RTO.dao.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, UUID> {
    public Vehicle findByRegistrationNumber(String registrationNumber);
}
