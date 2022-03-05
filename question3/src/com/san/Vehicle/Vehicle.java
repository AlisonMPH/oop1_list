package com.san.Vehicle;

import com.san.VehicleInterface.VehicleInterface;

public abstract class Vehicle implements VehicleInterface{
    protected String name;
    protected String brand;
    protected String color;
    protected int year;
    protected float mileage;

    public Vehicle (String name, String brand, String color, int year, float mileage) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public float getMileage() {
        return this.mileage;
    }

}
