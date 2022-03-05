package com.san.carModels.Truck;

import com.san.Car.Car;

public class Truck extends Car {

    public Truck (
        String name, 
        String brand, 
        String color, 
        int year, 
        float mileage,
        float trunkBedSize,
        short numberOfDoors
    ) {
        super (name, brand,color, year, mileage, trunkBedSize);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double getTrunkSize() {
        return this.trunkBedSize;
    }
}
