package com.san.Car;

import com.san.Vehicle.Vehicle;

public abstract class Car extends Vehicle  {
    protected short numberOfDoors;
    protected double trunkSize;
    protected float trunkBedSize;
    
    public Car(
        String name, 
        String brand, 
        String color, 
        int year,
        double mileage, 
        double trunkSize
    ) {
        super (name, brand, color, year, mileage);
        this.trunkSize = trunkSize;
    }

    public Car (
        String name, 
        String brand, 
        String color, 
        int year, 
        double mileage,
        float trunkBedSize
    ) {
        super (name, brand, color, year, mileage);
        this.trunkBedSize = trunkBedSize;

    }

    public short getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public double getTrunkSize() {
        return this.trunkSize;
    }
}

