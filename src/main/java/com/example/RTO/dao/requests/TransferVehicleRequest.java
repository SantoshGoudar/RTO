package com.example.RTO.dao.requests;

import java.util.Set;
import com.example.RTO.dao.models.Vehicle;
import lombok.Data;

@Data
public class TransferVehicleRequest {
    String sourceUserName;
    String sourceUserEmail;
    String sourceUserPhoneNumber;
    String targetUserName;
    String targetUserEmail;
    String targetUserPhoneNumber;
    VehicleRequest vehicle;
}
