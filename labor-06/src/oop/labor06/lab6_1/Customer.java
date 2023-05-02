package oop.labor06.lab6_1;

import java.util.ArrayList;

public class Customer {

    private final String firstName;
    private String lastName;
    private final int id;
    private static int numCustomers = 0;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = ++numCustomers;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public void addAccount(BankAccount account) { accounts.add(account); }

    @Override
    public String toString() {
        return account + " szamla tulajdonosa: " + this.firstName + " " + this.lastName;
    }

    public void closeAccount() { this.account = null; }
}
