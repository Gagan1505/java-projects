package com.xworkz.yono.sbi;

public class BankAccount {

    private double balance;

    public void debit(int amount){
        if(balance >= amount)
            balance = balance - amount;
        System.out.println("debited : "+amount);

    }

    public void credit(int amount){

        balance = balance + amount;
        System.out.println("credited : "+amount);
    }


    public void transfer(int amount , BankAccount beneficiaryAccount){

        System.out.println("transferring "+amount);
        this.debit(amount);
        beneficiaryAccount.credit(amount);
    }

    public double getBalance(){
        return  this.balance;
    }

//    public void setBalance(int amount){
//        balance += amount;
//    }



}
