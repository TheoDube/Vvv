package com.ub.csi142.app;

import com.ub.csi142.payment.*;

public class MainApp {

    public static void main(String[] args) {

        PaymentMethod[] payments = {
                new CashPayment(),
                new MobileWalletPayment("wallet123", 500.0)
        };

        for (PaymentMethod payment : payments) {
            System.out.println("\nPayment Method: " + payment.getName());
            payment.pay(100.0);
        }

        System.out.println("\nTesting payment above wallet limit:");
        payments[1].pay(700.0);
    }
}
