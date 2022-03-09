package com.san.Menu;

import java.util.Scanner;

public abstract class ProcessMenu {
    public static void process(Scanner scan, byte option) {
        switch (option) {
            case 1:
                VehiclesForSale.show();
                break;
            case 2:
                SellVehicleMenu.show(scan);
                break;
            case 0:
                ExitProgramMenu.show();
                break;
            default:
                InvalidOptionMenu.show();
                break;
        }
    }
}
