package com.ub.csi142.components;

public class Battery {
    private int capacityKWh;

    public Battery(int capacityKWh) {
        this.capacityKWh = capacityKWh;
    }

    @Override
    public String toString() {
        return "Battery: " + capacityKWh + " kWh";
    }
}
