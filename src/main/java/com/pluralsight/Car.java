package com.pluralsight;

public class Car extends Vehicle{
    int topSpeed;
    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int topSpeed){
       super(color, numberOfPassengers,cargoCapacity, fuelCapacity);
       this.topSpeed = topSpeed;
    }
}
