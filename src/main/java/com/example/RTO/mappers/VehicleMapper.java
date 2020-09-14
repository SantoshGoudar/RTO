package com.example.RTO.mappers;

import java.util.List;
import java.util.Set;
import com.example.RTO.dao.models.Vehicle;
import com.example.RTO.dao.requests.VehicleRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class VehicleMapper {


    public abstract List<Vehicle> requestToVehicle(Set<VehicleRequest> vehicles);

    public abstract VehicleRequest vehToVehicleRequest(Vehicle request);

    public abstract Vehicle vehRequestToVehicle(VehicleRequest request);
}
