package com.renting.persistence;

import com.renting.models.Person;
import com.renting.models.Vehicle;

import java.io.*;
import java.util.ArrayList;

public class FileVehicleDao implements VehicleDao {
    String fileName;
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public FileVehicleDao(String fileName) {
        this.fileName = fileName;
        loadVehicles();
    }

    public void updateVehiclesFile() {
        try(FileOutputStream fileOutputStream = new FileOutputStream(this.fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(this.vehicles);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadVehicles() {
        try(FileInputStream fileInputStream = new FileInputStream(this.fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            vehicles = (ArrayList<Vehicle>) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Vehicle get(String identification) {
        return null;
    }

    @Override
    public ArrayList<Vehicle> getAll() {
        return vehicles;
    }

    @Override
    public void add(Vehicle vehicle) {
        vehicles.add(vehicle);
        updateVehiclesFile();
    }

    @Override
    public void update(Vehicle vehicle) {

    }

    @Override
    public void delete(Vehicle vehicle) {

    }
}
