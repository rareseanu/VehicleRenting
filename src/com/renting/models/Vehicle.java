package com.renting.models;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private String registrationNumber;
    private VehicleType type;
    private int manufacturingYear;
    private String brand;
    private String colour;

    public Vehicle(String registrationNumber, VehicleType type, int manufacturingYear,
            String brand, String colour) {
        this.registrationNumber = registrationNumber;
        this.type = type;
        this.manufacturingYear = manufacturingYear;
        this.brand = brand;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", type=" + type +
                ", manufacturingYear=" + manufacturingYear +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
