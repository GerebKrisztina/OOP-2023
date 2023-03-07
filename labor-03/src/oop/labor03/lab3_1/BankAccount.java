package oop.labor03.lab3_1;
public class BankAccount {
    //atributumok
    private String accountNumber;
    private double balance;
    //konstruktor
    public BankAccount (String accountNumber) {
        this.balance=0;
        this.accountNumber=accountNumber;
    }
    //toString hogyan jelenjen meg
    @Override
    public String toString(){
        return accountNumber+": "+balance+" RON";
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return balance;
    }
    public void deposit(double penz){
        if(penz>0){
            this.balance=+penz;
        }
    }

    public boolean withdraw(double penz){
        if(penz <= balance){
            balance=balance-penz;
            return true;
        }
        return false;
    }

}
