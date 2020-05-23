package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(1000);
        account.depositFunds(500.0);
        account.withdrawFunds(750);
        account.withdrawFunds(1000);
        System.out.println(account.getAccountNumber()); //parameters from empty constructor

        BankAccount accountWithConstructor = new BankAccount("12345", 0.00, "Bob Dylan", "bobd@gmail.com", "123456789");
        accountWithConstructor.depositFunds(1500.0);
        accountWithConstructor.withdrawFunds(750);
        accountWithConstructor.withdrawFunds(1000);

        BankAccount accountWithGeneratedConstructor = new BankAccount("Krzys","email","1919191");
        System.out.println(accountWithGeneratedConstructor.getAccountNumber() + " name " + accountWithGeneratedConstructor.getCustomerName());

        VipCustomer cus1 = new VipCustomer();
        System.out.println(cus1.getName());

        VipCustomer cus2 = new VipCustomer("Bob", 25000.00);
        System.out.println(cus2.getName());

        VipCustomer cus3 = new VipCustomer("Tim", 100.00, "tim@email.com");
        System.out.println(cus3.getName());

        VipCustomer cus4 = new VipCustomer("Chris",10000.00, "krz.liszka@gmail.com");
        System.out.println(cus4.getCreditLimit());
    }
}
