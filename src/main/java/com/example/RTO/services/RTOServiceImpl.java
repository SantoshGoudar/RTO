package com.example.RTO.services;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import com.example.RTO.dao.models.User;
import com.example.RTO.dao.models.Vehicle;
import com.example.RTO.dao.repositories.UserRepository;
import com.example.RTO.dao.repositories.VehicleRepository;
import com.example.RTO.dao.requests.RegisterVehicleRequest;
import com.example.RTO.dao.requests.TransferVehicleRequest;
import com.example.RTO.dao.responses.RegisteredResponse;
import com.example.RTO.mappers.UserMapper;
import com.example.RTO.mappers.VehicleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RTOServiceImpl implements RTOService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    VehicleRepository vehicleRepository;

    @Autowired
    UserMapper userMapper;

    @Autowired
    VehicleMapper vehicleMapper;

    @Override
    public RegisteredResponse registerVehicles(RegisterVehicleRequest registerVehicleRequest) {

        User user = userRepository.findByPhoneNumber(registerVehicleRequest.getPhoneNumber());
        if (user != null) {
            user.getVehicles()
                .addAll(vehicleMapper.requestToVehicle(registerVehicleRequest.getVehicles()).stream().map(vehicle -> {
                    vehicle.setOwner(user);
                    return vehicle;
                }).collect(Collectors.toList()));
            return userMapper.userToResponse(userRepository.save(user));
        } else {

            return userMapper.userToResponse(userRepository.save(userMapper.requestToUser(registerVehicleRequest)));
        }
    }

    @Override
    @Transactional
    public RegisteredResponse transferVehicle(TransferVehicleRequest transferVehicleRequest) {
        User number = userRepository.findByPhoneNumber(transferVehicleRequest.getSourceUserPhoneNumber());
        Set<Vehicle> vehicles = number
            .getVehicles();
        if (userRepository.existsUserByPhoneNumber(transferVehicleRequest.getTargetUserPhoneNumber())) {
            User byPhoneNumber = userRepository.findByPhoneNumber(transferVehicleRequest.getTargetUserPhoneNumber());
            Vehicle e = vehicles.stream().filter(vehicle -> vehicle.getRegistrationNumber()
                .equalsIgnoreCase(transferVehicleRequest.getVehicle().getRegistrationNumber())).findFirst()
                .orElse(null);
            byPhoneNumber.getVehicles().add(e);
            number.getVehicles().remove(e);
            e.setOwner(byPhoneNumber);
            userRepository.save(number);
            userRepository.save(byPhoneNumber);
        }
        RegisteredResponse registeredResponse = userMapper.transferToResponse(transferVehicleRequest);
        registeredResponse.setVehicles(Arrays.asList(transferVehicleRequest.getVehicle()));
        return registeredResponse;
    }

    @Override
    public List<RegisteredResponse> getAllDetails() {
        return userRepository.findAll().stream().map(userMapper::userToResponse).collect(Collectors.toList());
    }
}
