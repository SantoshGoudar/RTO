package com.example.RTO.dao.requests;

import java.util.Set;
import lombok.Data;

@Data
public class RegisterVehicleRequest {
    String name;
    String email;
    String phoneNumber;
    Set<VehicleRequest> vehicles;
}
