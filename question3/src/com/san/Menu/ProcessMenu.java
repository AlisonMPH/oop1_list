package com.san.Menu;

public abstract class ProcessMenu {
    public static void process(byte option) {
        switch (option) {
            case 1:
                BuyVehicleMenu.show();
                break;
            case 2:
                SellVehicleMenu.show();
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
