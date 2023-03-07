package lab3_2;

import oop.labor03.lab3_1.BankAccount;

public class Customer {
    private String firstName;
    private String lastName;

    // constant
    public static final int MAX_ACCOUNTS = 10;
    // number of accounts
    private int numAccounts;
    // an array for the accounts
    private BankAccount accounts[] = new BankAccount[ MAX_ACCOUNTS ];

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount(BankAccount account) {
        return account;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
