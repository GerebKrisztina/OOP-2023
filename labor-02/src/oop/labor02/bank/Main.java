package oop.labor02.bank;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Bt0045768");
        System.out.println(account);
        System.out.println(account.toString());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        account.deposit(100);
        System.out.println(account.getBalance());
        account.deposit(-500);
        System.out.println(account.getBalance());
        account.withdraw(70);
        System.out.println(account.getBalance());
        account.withdraw(50);
        System.out.println(account.getBalance());
        boolean result= account.withdraw(500);
        if(!result){
            System.out.println("You do not have sufficient funds for this operation!");
        }

        BankAccount account1 = new BankAccount("OTP00001");
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());

    }
}
