package com.pluralsight;

public class Main {
    static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car fastRide = new Car();
        fastRide.setColor("Blue");
        fastRide.setFuelCapacity(20);

        SemiTruck hall = new SemiTruck();
        hall.setColor("White");
        hall.setFuelCapacity(12);

        Hovercraft fly = new Hovercraft();
        fly.setColor("Black");
        fly.setFuelCapacity(15);
    }
}
