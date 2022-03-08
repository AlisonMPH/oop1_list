package com.san.carModels.Hatch;

import com.san.Car.Car;

public class Hatch extends Car {
    
    public Hatch (
        String name, 
        String brand, 
        String color, 
        int year, 
        double mileage,
        double trunkSize
    ) {
        super (name, brand,color, year, mileage, trunkSize);
        this.numberOfDoors = 2;
    }
}
