package com.ub.csi142.payment;

public class CashPayment implements PaymentMethod {

    @Override
    public String getName() {
        return "Cash Payment";
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing cash payment of P" + amount);
    }
}
