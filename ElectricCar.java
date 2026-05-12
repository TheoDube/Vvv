package com.ub.csi142.vehicles;

import com.ub.csi142.components.Battery;

public class ElectricCar extends Car {
    private Battery battery;

    public ElectricCar(String make, String model, int year, int batteryCapacity) {
        super(make, model, year);
        this.battery = new Battery(batteryCapacity);
        System.out.println("ElectricCar constructor called");
    }

    @Override
    public void describe() {
        System.out.println("Electric Car: " + year + " " + make + " " + model);
        System.out.println("  " + battery);
    }
}
