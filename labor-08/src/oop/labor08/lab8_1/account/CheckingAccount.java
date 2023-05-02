package oop.labor08.lab8_1.account;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public String toString() {
        return super.toString() + ", overdraft limit: " +
    }
}
