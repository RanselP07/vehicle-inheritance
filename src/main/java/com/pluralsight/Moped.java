package com.pluralsight;

public class Moped extends Vehicle{
    private int topSpeed;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity,int topSpeed){
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.topSpeed = topSpeed;
    }
}
