package oop.labor08.lab8_1.account;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double interestRate) {
        super();
        System.out.println("Savings");
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", overdraft limit: " +
    }
}
