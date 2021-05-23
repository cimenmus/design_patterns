package com.company.creational.factory;

import com.company.creational.factory.model.Vehicle;
import com.company.creational.factory.model.VehicleType;

public class Main {

    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.createVehicle(VehicleType.CAR);
        car.writeInfo();

        Vehicle plane = vehicleFactory.createVehicle(VehicleType.PLANE);
        plane.writeInfo();

        Vehicle ship = vehicleFactory.createVehicle(VehicleType.SHIP);
        ship.writeInfo();
    }
}
