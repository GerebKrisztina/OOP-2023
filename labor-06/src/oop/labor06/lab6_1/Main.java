package oop.labor06.lab6_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("labor06");
        for (int i = 0; i < 150; ++i) {
            BankAccount account = new BankAccount();
            System.out.println(account);
        } */

        ArrayList<Customer> customers = new ArrayList<>();
        Customer c1 = new Customer("X", "Y");
        c1.addAccount(new BankAccount());
        System.out.println(c1);
        Customer c2 = new Customer("z", "w");
        c2.addAccount(new BankAccount());
        System.out.println(c2);
    }
}
