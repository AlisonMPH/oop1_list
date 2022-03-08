package com.san.carModels.Sedan;

import com.san.Car.Car;

public class Sedan extends Car {

    public Sedan (
        String name, 
        String brand, 
        String color, 
        int year, 
        double mileage,
        double trunkSize
    ) {
        super (name, brand,color, year, mileage, trunkSize);
        this.numberOfDoors = 4;
    }
}
