package com.pluralsight;

import java.util.ArrayList;

public class Moped extends Vehicle{
    private boolean hasKickstand;

    public Moped() {
    }

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, ArrayList<Wheel> wheels) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, wheels);
    }


}
