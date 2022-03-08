package com.san.Menu;

import  com.san.carModels.Hatch.Hatch;
import com.san.carModels.SUV.SUV;
import com.san.carModels.Sedan.Sedan;
import com.san.carModels.Truck.Truck;

public abstract class ProcessCarModelMenu {
    protected static void process (
        byte optionCarModel, 
        String nameVehicle, 
        String brandVehicle, 
        String colorVehicle, 
        int yearVehicle, 
        double mileageVehicle,
        double trunkSize,
        short numberOfDoors
    ) {
        switch (optionCarModel) {
            case 1:
                Hatch hatch = new Hatch(
                    nameVehicle, 
                    brandVehicle, 
                    colorVehicle, 
                    yearVehicle, 
                    mileageVehicle,
                    trunkSize
                );
                break;
            
            case 2:
                Sedan sedan = new Sedan (
                    nameVehicle, 
                    brandVehicle, 
                    colorVehicle, 
                    yearVehicle, 
                    mileageVehicle,
                    trunkSize
                );
                break;
            
            case 3:
                SUV suv = new SUV (
                    nameVehicle, 
                    brandVehicle, 
                    colorVehicle, 
                    yearVehicle, 
                    mileageVehicle,
                    trunkSize
                );
                break;
            
            case 4:
                Truck truck = new Truck (
                    nameVehicle, 
                    brandVehicle, 
                    colorVehicle, 
                    yearVehicle, 
                    mileageVehicle,
                    (float) trunkSize,
                    numberOfDoors
                );
                break;
            
            default:
                break;
        }
    }
}
