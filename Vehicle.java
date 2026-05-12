package com.ub.csi142.vehicles;

public class Vehicle {
    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
        System.out.println("Vehicle constructor called");
    }

    public void describe() {
        System.out.println("Vehicle: " + make + " " + model);
    }
}
