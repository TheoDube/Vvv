package com.ub.csi142.payment;

public abstract class AbstractPaymentValidator {

    protected double maxTransactionLimit;

    public AbstractPaymentValidator(double maxTransactionLimit) {
        this.maxTransactionLimit = maxTransactionLimit;
    }

    public boolean validateAmount(double amount) {
        return amount <= maxTransactionLimit;
    }

    public abstract void process(double amount);
}
