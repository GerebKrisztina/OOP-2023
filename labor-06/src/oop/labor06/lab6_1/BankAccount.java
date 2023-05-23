package oop.labor06.lab6_1;

import java.io.PrintStream;

public class BankAccount {

    private static int numAccounts = 0;
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    public static final String PREFIX = "OTP";
    private String accountNumber;
    private String createAccountNumber() {
        return String.format("%0" + ACCOUNT_NUMBER_LENGTH + "d", numAccounts);
    }
    private double balance;
    public BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
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
    private void printCustomers( PrintStream ps ) {
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer : customers) {
            ps.println( customer.getId()+", " + customer.getFirstName() + ", "+
                    customer.getLastName()+", "+customer.getNumAccounts());
        }
        ps.close();
    }
    public void printCustomersToStdout() {
        printCustomers( System.out );
    }

    public void printCustomersToFile( String filename ) {
        try {
            printCustomers( new PrintStream(filename ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
