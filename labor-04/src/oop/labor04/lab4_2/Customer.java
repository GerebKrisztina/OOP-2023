package oop.labor04.lab4_2;

import java.util.ArrayList;

public class Costumer {

    private final String firstName;
    private String lastName;
    private BankAccount account;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Costumer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
