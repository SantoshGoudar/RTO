package com.example.RTO.services;

import java.util.List;
import com.example.RTO.dao.requests.RegisterVehicleRequest;
import com.example.RTO.dao.requests.TransferVehicleRequest;
import com.example.RTO.dao.responses.RegisteredResponse;

public interface RTOService {


    RegisteredResponse registerVehicles(RegisterVehicleRequest registerVehicleRequest);

    RegisteredResponse transferVehicle(TransferVehicleRequest transferVehicleRequest);

    List<RegisteredResponse> getAllDetails();
}
