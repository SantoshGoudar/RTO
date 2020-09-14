package com.example.RTO.dao.requests;

import lombok.Data;

@Data
public class TransferVehicleRequest {
    String sourceUserPhoneNumber;
    String targetUserName;
    String targetUserEmail;
    String targetUserPhoneNumber;
    VehicleRequest vehicle;
}
