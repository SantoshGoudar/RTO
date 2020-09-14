package com.example.RTO.mappers;

import com.example.RTO.dao.models.User;
import com.example.RTO.dao.models.Vehicle;
import com.example.RTO.dao.requests.RegisterVehicleRequest;
import com.example.RTO.dao.requests.TransferVehicleRequest;
import com.example.RTO.dao.requests.VehicleRequest;
import com.example.RTO.dao.responses.RegisteredResponse;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public abstract class UserMapper {

    public abstract User requestToUser(RegisterVehicleRequest registerVehicleRequest);

   /* @AfterMapping
    public void afterMapping(@MappingTarget User user, RegisterVehicleRequest registerVehicleRequest) {
        user.getVehicles().stream().forEach(vehicle -> vehicle.setOwner(user));
    }*/

    public abstract RegisteredResponse userToResponse(User user);

    @Mappings( {@Mapping(target = "name", source = "targetUserName"), @Mapping(target = "email", source = "targetUserEmail"), @Mapping(target = "phoneNumber", source = "targetUserPhoneNumber")})
    public abstract RegisteredResponse transferToResponse(TransferVehicleRequest transferVehicleRequest);

    public abstract RegisteredResponse requestToResponse(RegisterVehicleRequest registerVehicleRequest);

    public abstract Vehicle vehRequestToVehicle(VehicleRequest request);

    public abstract VehicleRequest vehToVehicleRequest(Vehicle request);
}
