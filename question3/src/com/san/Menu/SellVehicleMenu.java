package com.san.Menu;

import java.util.Scanner;

public abstract class SellVehicleMenu {
    protected static void show() {
        Scanner scan = new Scanner(System.in);
        byte option;
        do {
            ClearScreenMenu.clearScreen();
            System.out.format("%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
            System.out.println("\tIs Bike or Car?\n");
            System.out.println("[1] - Bike\t[2] - Car\t[0] - Cancel");
            System.out.format("\n%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
            System.out.print("Enter your option: ");
            option = scan.nextByte();
            if (option == 0) break;

            ClearScreenMenu.clearScreen();
            System.out.format("%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
            System.out.println("\tName of Vehicle: ");
            System.out.println("\n\t[0] - Cancel");
            System.out.format("\n%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
            System.out.print("Enter Name: ");
            scan.nextLine();
            String nameVehicle = scan.nextLine();
            if(nameVehicle.equals("0")) break;

            ClearScreenMenu.clearScreen();
            System.out.format("%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
            System.out.println("\tBrand of Vehicle: ");
            System.out.println("\n\t[0] - Cancel");
            System.out.format("\n%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
            System.out.print("Enter Brand: ");
            String brandVehicle = scan.nextLine();
            if (brandVehicle.equals("0")) break;

            ClearScreenMenu.clearScreen();
            System.out.format("%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
            System.out.println("\tColor of Vehicle: ");
            System.out.println("\n\t[0] - Cancel");
            System.out.format("\n%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
            System.out.print("Enter Color: ");
            String colorVehicle = scan.nextLine();
            if (colorVehicle.equals("0")) break;

            ClearScreenMenu.clearScreen();
            System.out.format("%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
            System.out.println("\tYear of Vehicle: ");
            System.out.println("\n\t[0] - Cancel");
            System.out.format("\n%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
            System.out.print("Enter Year: ");
            int yearVehicle = scan.nextInt();
            if (yearVehicle == 0) break;

            ClearScreenMenu.clearScreen();
            System.out.format("%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
            System.out.println("\tMileage of Vehicle: ");
            System.out.println("\n\t[0] - Cancel");
            System.out.format("\n%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
            System.out.print("Enter Mileage: ");
            double mileageVehicle = scan.nextDouble();
            if (mileageVehicle == 0) break;
            
            if (option == 2) {
                ClearScreenMenu.clearScreen();
                System.out.format("%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
                System.out.println("\tTrunkSize of Vehicle: ");
                System.out.println("\n\t[0] - Cancel");
                System.out.format("\n%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
                System.out.print("Enter TrunkSize: ");
                double trunkSize = scan.nextDouble();
                if (trunkSize == 0) break;

                CarModelsMenu.show();
                byte optionCarModel = scan.nextByte();
                short numberOfDoors = 0;
                if (optionCarModel == 4) {
                    ClearScreenMenu.clearScreen();
                    System.out.format("%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
                    System.out.println("\tNumbers of Doors: ");
                    System.out.println("\n\t[0] - Cancel");
                    System.out.format("\n%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
                    System.out.print("Enter Number: ");
                    numberOfDoors = scan.nextShort();
                    if (trunkSize == 0) break;
                }
                ProcessCarModelMenu.process (
                    optionCarModel, 
                    nameVehicle, 
                    brandVehicle, 
                    colorVehicle, 
                    yearVehicle, 
                    mileageVehicle, 
                    trunkSize,
                    numberOfDoors
                );
            }

            else {
                ProcessBikeMenu.process (
                    nameVehicle, 
                    brandVehicle, 
                    colorVehicle, 
                    yearVehicle, 
                    mileageVehicle
                );
            }
            
            break;
        } while (true);
        scan.close();
    }
}
