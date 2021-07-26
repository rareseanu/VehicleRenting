package com.renting.persistence;

import com.renting.models.Vehicle;

import java.util.ArrayList;

public class VehicleDao implements Dao<Vehicle> {
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    @Override
    public Vehicle get(String identification) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.getRegistrationNumber().equals(identification))
                .findFirst()
                .get();
    }

    @Override
    public ArrayList<Vehicle> getAll() {
        return vehicles;
    }

    @Override
    public void add(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public void update(Vehicle vehicle) {

    }

    @Override
    public void delete(Vehicle vehicle) {

    }
}
