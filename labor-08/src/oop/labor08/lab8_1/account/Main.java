package oop.labor08.lab8_1.account;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        SavingsAccount sAccount = new SavingsAccount(1.9);
        CheckingAccount cAccount = new CheckingAccount(500);
        System.out.println(sAccount);
        System.out.println(sAccount);
        ArrayList<BankAccount> accounts = new ArrayList<>();
        for(int i=0; i<29; ++i){
            if(i%2==0) {
                accounts.add(new SavingsAccount(i / 1.5));
            }
            else {
                accounts.add(new CheckingAccount(i * 10));
            }
            System.out.println(accounts.get(i));
            accounts.get(i).deposit(1000);
            accounts.get(i).withdraw(1050);
            System.out.println(accounts.get(i));
        }
        for(BankAccount ba : accounts) {
            if(ba instanceof SavingsAccount) {
                System.out.println(((SavingsAccount) ba).getInterestRate());
            }
            if(ba.getClass() == CheckingAccount.class){
                System.out.println(((CheckingAccount) ba).getOverdraftLimit());
            }
        } */


        ArrayList<BankAccount> accounts = new ArrayList<>();
        Bank b = new Bank("OTP");
        b.addCustomer(new Customer("A", "B"));
        b.getCustomer(1).addAccount(new SavingsAccount(20));
        b.getCustomer(1).addAccount(new CheckingAccount(200));
        b.addCustomer(new Customer("X", "Y"));
        b.getCustomer(2).addAccount(new SavingsAccount(500));
        b.getCustomer(2).addAccount(new CheckingAccount(2000));
        System.out.println(b.getCustomer(1));
        System.out.println(b.getCustomer(2));
    }
}
