package com.example.RTO.dao.responses;

import java.util.List;
import com.example.RTO.dao.requests.VehicleRequest;
import lombok.Data;

@Data
public class RegisteredResponse {
    String name;
    String email;
    String phoneNumber;
    List<VehicleRequest> vehicles;
}
