package com.example.RTO.controllers;

import java.util.List;
import com.example.RTO.dao.requests.RegisterVehicleRequest;
import com.example.RTO.dao.requests.TransferVehicleRequest;
import com.example.RTO.dao.responses.RegisteredResponse;
import com.example.RTO.services.RTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("RTOApplication")
public class RTOController {

    @Autowired
    RTOService rtoService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.OK)
    public RegisteredResponse registerVehicle(@RequestBody RegisterVehicleRequest registerVehicleRequest) {
        return rtoService.registerVehicles(registerVehicleRequest);
    }


    @PostMapping("/transfer")
    @ResponseStatus(HttpStatus.OK)
    public RegisteredResponse transferVehicle(@RequestBody TransferVehicleRequest transferVehicleRequest) {
        return rtoService.transferVehicle(transferVehicleRequest);
    }

    @GetMapping("/view")
    @ResponseStatus(HttpStatus.OK)
    public List<RegisteredResponse> getAllDetails() {
        return rtoService.getAllDetails();
    }


}
