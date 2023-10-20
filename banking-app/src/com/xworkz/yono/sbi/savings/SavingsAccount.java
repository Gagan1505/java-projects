package com.xworkz.yono.sbi.savings;

import com.xworkz.yono.sbi.BankAccount;

public class SavingsAccount extends BankAccount {

    double rateOfInterest = 3;
    public SavingsAccount(){

    }

    public SavingsAccount(double minBalance){
        this.credit((int)minBalance);
    }

    public void calculateInterest(){
        double interestAmount = (rateOfInterest * getBalance())/100;
        this.credit((int)interestAmount);
        System.out.println("Account balance after interest is "+getBalance());
    }
}
