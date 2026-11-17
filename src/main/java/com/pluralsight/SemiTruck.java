package com.pluralsight;

import java.math.BigDecimal;

public class SemiTruck extends Vehicle{
    double truckLength;
    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, double truckLength){
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.truckLength = truckLength;
    }
}
