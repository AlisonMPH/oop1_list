package com.san.Bike;

import com.san.Vehicle.Vehicle;

public class Bike extends Vehicle {

    public Bike(
        String name, 
        String brand, 
        String color, 
        int year, 
        double mileage,
        String licensePlate,
        String ownersName,
        double price
    ) {
        super(name, brand, color, year, mileage, licensePlate, ownersName, price);
    }
}
