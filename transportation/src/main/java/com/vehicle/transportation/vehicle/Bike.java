package com.vehicle.transportation.vehicle;

import com.vehicle.transportation.runner.VehicleConsole;

public class Bike implements VehicleConsole {
    public void left() {
        System.out.println("Bike is turning left");
    }

    public void right() {
        System.out.println("Bike is turning right");
    }

    public void moveForward() {
        System.out.println("Bike is moving forward");
    }

    public void moveBackward() {
        System.out.println("Bike is moving backward");
    }
}

