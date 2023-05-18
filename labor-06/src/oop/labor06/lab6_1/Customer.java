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
    public int getNumAccounts() {
        return accounts.size();
    }

    public ArrayList<String> getAccountNumbers() {
        ArrayList<String> result=new ArrayList<>();
        for (BankAccount account:this.accounts) {
            result.add(account.getAccountNumber());
        }
        return result;
    }
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }
    public BankAccount getAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).getAccountNumber().equals(accountNumber)) {
                return accounts.get(i);
            }
        }
        return null;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", accounts=" + accounts +
                '}';
    }

    public void closeAccount() {
        for (int i = 0; i < accounts.size(); i++) {
            accounts.remove(i);
            break;
        }
    }
}
