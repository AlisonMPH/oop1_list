package com.san.SaleRecord;

import com.san.Vehicle.Vehicle;

public class SaleRecord {
    private Vehicle vehicle;
    private String buyerName;
    private String paymentType;

    public SaleRecord(Vehicle vehicle, String buyerName, String paymentType) {
        this.vehicle = vehicle;
        this.buyerName = buyerName;
        this.paymentType = paymentType;
    }
}
