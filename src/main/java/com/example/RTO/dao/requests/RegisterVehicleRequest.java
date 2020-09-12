package com.example.RTO.dao.requests;

import java.util.Set;
import com.example.RTO.dao.models.Vehicle;
import lombok.Data;

@Data
public class RegisterVehicleRequest {
    String name;
    String email;
    String phonenumber;
    Set<VehicleRequest> vehicles;
}
