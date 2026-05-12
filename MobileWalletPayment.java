package com.ub.csi142.payment;

public class MobileWalletPayment extends AbstractPaymentValidator implements PaymentMethod {

    private String walletID;

    public MobileWalletPayment(String walletID, double maxLimit) {
        super(maxLimit);
        this.walletID = walletID;
    }

    @Override
    public String getName() {
        return "Mobile Wallet Payment";
    }

    @Override
    public void process(double amount) {
        System.out.println("Processing mobile payment of P" + amount +
                " from wallet " + walletID);
    }

    @Override
    public void pay(double amount) {
        if (validateAmount(amount)) {
            process(amount);
        } else {
            System.out.println("Payment of P" + amount +
                    " exceeds wallet limit.");
        }
    }
}
