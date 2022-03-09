package com.san.Menu;

import java.util.Scanner;

import com.san.SalesList.SalesList;
import com.san.SalesRecordList.SalesRecordList;
import com.san.Vehicle.Vehicle;

public abstract class RegisterSalesMenu {
    protected static void show(Scanner scan) {
        while (true) {
            int indexVehicle = IndexVehicleMenu.input(scan);
            Vehicle vehicle = SalesList.getVehicle(indexVehicle);
            if (vehicle == null) {
                InvalidOptionMenu.show();
                break;
            }

            String buyerName = BuyerNameMenu.input(scan);
            if (buyerName.equals("0")) break;

            byte paymentTypeOption;
            String paymentType = "N/A";
            while (true) {
                paymentTypeOption = PaymentTypeMenu.input(scan);
                
                if (paymentTypeOption == 0) break;
                else if (paymentTypeOption == 1) paymentType = "Credit Card";
                else if (paymentTypeOption == 2) paymentType = "Debit Card";
                else if (paymentTypeOption == 3) paymentType = "Cash";
                else {
                    InvalidOptionMenu.show();
                }
            }
            if (paymentTypeOption == 0) break;

            SalesRecordList.add(vehicle, buyerName, paymentType);
        }
        
    }
}
