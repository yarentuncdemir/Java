package com.company;

public class Bank {
    private String accountNumber;
    private double balance;
    private String costumerName;
    private String email;
    private String phoneNumber;

    public Bank(){
        this("56789", 2.5D, "Default name", "Default address", "default phone");
        System.out.println("Empty constructor called");
    }
    public Bank(String accountNumber,double balance,String costumerName,String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.costumerName=costumerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    public Bank(String customerName, String email, String phoneNumber) {
        this("99999", 100.55D, customerName, email, phoneNumber);
    }
    public void deposit(double depositAmount){
        this.balance+=depositAmount;
    }
    public void withdraw(double withdrawAmount){
        if (this.balance-withdrawAmount<0){
            System.out.println("Only = " + this.balance);
        }
        this.balance-=withdrawAmount;
        System.out.println("withdrawAmount = " + withdrawAmount + " " + "Balance=" + this.balance);
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
