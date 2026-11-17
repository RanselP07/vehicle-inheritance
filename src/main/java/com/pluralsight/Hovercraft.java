package com.pluralsight;

public class Hovercraft extends Vehicle{
    private int topSpeed;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity,int topSpeed){
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.topSpeed = topSpeed;
    }
}
