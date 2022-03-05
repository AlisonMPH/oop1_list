package com.san.Menu;

public abstract class ShowMenu {
    public static void show() {
        ClearScreenMenu.clearScreen();
        System.out.format("%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
        System.out.println("\t1 - Buy Vehicles");
        System.out.println("\t2 - Sell Vehicle");
        System.out.println("\t0 - Exit");
        System.out.format("\n%s\n\n", "-".repeat(Menu.QUANTITY_OF_CHARACTERS));
    }
}
