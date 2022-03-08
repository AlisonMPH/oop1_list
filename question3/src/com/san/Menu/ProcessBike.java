package com.san.Menu;

import com.san.Bike.Bike;
import com.san.SalesList.SalesList;

public abstract class ProcessBike {
    protected static void process (
        String nameVehicle, 
        String brandVehicle, 
        String colorVehicle, 
        int yearVehicle, 
        double mileageVehicle
    ) {
        SalesList.add(
            new Bike(
                nameVehicle, 
                brandVehicle, 
                colorVehicle, 
                yearVehicle, 
                mileageVehicle
            )
        );
    }
}
