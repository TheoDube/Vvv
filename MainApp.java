package com.ub.csi142.app;

import com.ub.csi142.vehicles.ElectricCar;

public class MainApp {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Model 3", 2023, 75);
        ElectricCar nissan = new ElectricCar("Nissan", "Leaf", 2022, 60);
        
        System.out.println("\n--- Describing cars ---");
        tesla.describe();
        System.out.println();
        nissan.describe();
    }
}
