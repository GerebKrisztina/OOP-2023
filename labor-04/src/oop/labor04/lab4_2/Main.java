package oop.labor04.lab4_2;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "BLACK");
        System.out.println(customer1);
        customer1.setAccount(new BankAccount("01OTP"));
        System.out.println(customer1);
        customer1.getAccount().deposit(1000);
        System.out.println(customer1);
        if(customer1.getAccount().withdraw(500) == false) {
            System.out.println("Nincs eleg penz a szamlan");
        }
        System.out.println(customer1);
        Customer customer2 = new Customer("Mary", "WHITE");
        System.out.println(customer2);
        customer2.setAccount(new BankAccount("02OTP"));
        System.out.println(customer2);
        customer2.getAccount().deposit(2000);
        System.out.println(customer2);

        customer2.closeAccount();
        System.out.println(customer2);
        customer2.setLastName(customer1.getLastName());
        System.out.println(customer2);
        customer2.setAccount(customer1.getAccount());
        System.out.println(customer2);
    }
}
