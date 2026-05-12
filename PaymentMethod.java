package com.ub.csi142.payment;

public interface PaymentMethod {
    String getName();
    void pay(double amount);
}
