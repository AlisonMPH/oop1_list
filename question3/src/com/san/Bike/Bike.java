package com.san.Bike;

import com.san.Vehicle.Vehicle;

public class Bike extends Vehicle {

    public Bike(
        String name, 
        String brand, 
        String color, 
        int year, 
        float mileage
    ) {
        super(name, brand, color, year, mileage);
    }
}
