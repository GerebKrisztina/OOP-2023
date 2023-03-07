package oop.labor04.lab4_2;

import oop.labor03.lab3_1.BankAccount;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
11
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BankAccount getAccount(String accountNumber) {
        for(BankAccount na : accounts){
            if(ba.getAccountNumber().equals(accountNumber)) {
                return ba;
            }
        }
        return null;
    }
    public void addAccount(BankAccount account) {
        if(numAccounts< MAX_ACCOUNTS){
            accounts[numAccounts] = account;
            numAccounts++;
        }
    }


    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + accounts;
    }
    public void closeAccount(){
        this.accounts = null;
    }

}
