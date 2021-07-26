package com.renting.services;

import com.renting.models.Vehicle;
import com.renting.models.VehicleType;
import com.renting.persistence.VehicleDao;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class VehicleService {
    private final VehicleDao vehicleDao;

    public VehicleService(VehicleDao vehicleDao) {
        this.vehicleDao = vehicleDao;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleDao.add(vehicle);
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return vehicleDao.getAll();
    }

    public ArrayList<Vehicle> getSortedByManufacturingYear() {
        return getAllVehicles().stream()
                .sorted((v1, v2) -> v1.getManufacturingYear() - v2.getManufacturingYear())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Vehicle> getVehiclesByType(VehicleType type) {
        return getAllVehicles().stream()
                .filter(vehicle -> vehicle.getType() == type)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
