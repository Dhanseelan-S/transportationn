package com.vehicle.transportation.vehicle;

import com.vehicle.transportation.runner.VehicleConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary primary is used to prevent the confusion of spring it changes what to choose btw two or more qualifying beans
@Qualifier("bus_qualifier")
public class Bus implements VehicleConsole {
    public void left(){
        System.out.println("Bus is turning left");
    }
    public void right(){
        System.out.println("Bus is turning right");
    }
    public void moveForward(){
        System.out.println("Bus is moving forward");
    }
    public void moveBackward(){
        System.out.println("Bus is moving backward");
    }
}
