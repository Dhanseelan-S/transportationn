package com.vehicle.transportation.vehicle;

import com.vehicle.transportation.runner.VehicleConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleRunner {
    private VehicleConsole vehicleConsole;

    public VehicleRunner(@Qualifier("car_qualifier") VehicleConsole vehicleConsole){
        this.vehicleConsole = vehicleConsole;
    }

    public void run(){
        vehicleConsole.left();
        vehicleConsole.right();
        vehicleConsole.moveForward();
        vehicleConsole.moveBackward();
    }
}
