package com.ub.csi142.vehicles;

public class Car extends Vehicle {
    protected int year;

    public Car(String make, String model, int year) {
        super(make, model);
        this.year = year;
        System.out.println("Car constructor called");
    }

    @Override
    public void describe() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}
