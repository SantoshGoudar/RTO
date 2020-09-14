package com.example.RTO.mappers;

import com.example.RTO.dao.models.User;
import com.example.RTO.dao.models.Vehicle;
import com.example.RTO.dao.requests.RegisterVehicleRequest;
import com.example.RTO.dao.requests.TransferVehicleRequest;
import com.example.RTO.dao.requests.VehicleRequest;
import com.example.RTO.dao.responses.RegisteredResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User requestToUser(RegisterVehicleRequest registerVehicleRequest);

    RegisteredResponse userToResponse(User user);

    @Mappings( {@Mapping(target = "name", source = "targetUserName"), @Mapping(target = "email", source =
        "targetUserEmail"), @Mapping(target = "phoneNumber", source = "targetUserPhoneNumber")})
    RegisteredResponse transferToResponse(TransferVehicleRequest transferVehicleRequest);

    RegisteredResponse requestToResponse(RegisterVehicleRequest registerVehicleRequest);

    Vehicle vehRequestToVehicle(VehicleRequest request);

    VehicleRequest vehToVehicleRequest(Vehicle request);
}
