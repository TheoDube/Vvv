public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    
    // constructor 1
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        balance = 0.0;
    }
    
    // constructor 2
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0.0;
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    // deposit positive only
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }
    
    // withdraw if enough money
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        }
        return false;
    }
    
    public String toString() {
        return accountNumber + " | " + ownerName + " | P" + balance;
    }
}
