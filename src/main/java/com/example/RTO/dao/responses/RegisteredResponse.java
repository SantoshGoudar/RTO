package com.example.RTO.dao.responses;

import java.util.List;
import java.util.Set;
import com.example.RTO.dao.models.Vehicle;
import com.example.RTO.dao.requests.VehicleRequest;
import lombok.Data;

@Data
public class RegisteredResponse {
    String name;
    String email;
    String phonenumber;
    List<VehicleRequest> vehicles;
}
