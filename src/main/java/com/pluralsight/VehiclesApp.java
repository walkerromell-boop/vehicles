package com.pluralsight;

import java.util.ArrayList;

public class VehiclesApp {
    public static void main(String[] args) {

        Moped slowride = new Moped("Red",2,0,5, new ArrayList<Wheel>());
        slowride.setColor("orange");
        slowride.setFuelCapacity(2);

        Car fastCar = new Car();
        fastCar.setColor("Blue");
        fastCar.setNumberOfPassengers(5);
        fastCar.setFuelCapacity(16);

        SemiTruck bigRig = new SemiTruck();
        bigRig.setColor("Red/Blue");
        bigRig.setNumberOfPassengers(2);
        bigRig.setFuelCapacity(100);
        bigRig.setCargoCapacity(1000);

        Hovercraft flyingCar= new Hovercraft();
        flyingCar.setColor("Candy Red");
        flyingCar.setNumberOfPassengers(6);
        flyingCar.setCargoCapacity(3);

        System.out.println(slowride);
        System.out.println(flyingCar);
        System.out.println(bigRig);
        System.out.println(fastCar);
        flyingCar.getColor();
        System.out.println(flyingCar.getColor());
    }





}
