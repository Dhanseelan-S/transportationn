package com.vehicle.transportation.vehicle;

import com.vehicle.transportation.runner.VehicleConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
//@Primary
@Qualifier("car_qualifier")
public class Car implements VehicleConsole {
    public void left(){
        System.out.println("Car is turning left");
    }
    public void right(){
        System.out.println("Car is turning right");
    }
    public void moveForward(){
        System.out.println("Car is moving forward");
    }
    public void moveBackward(){
        System.out.println("Car is moving backward");
    }
}
