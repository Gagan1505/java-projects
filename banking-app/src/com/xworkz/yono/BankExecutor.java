package com.xworkz.yono;

import com.xworkz.yono.sbi.BankAccount;
import com.xworkz.yono.sbi.savings.SavingsAccount;

public class BankExecutor {

    public static void main(String[] args) {

        BankAccount myaccount = new SavingsAccount(10000);
        myaccount.credit(20000);
        myaccount.debit(1000);
        System.out.println("My initial Account Balance is " +myaccount.getBalance());

        SavingsAccount mySavingsAccount = (SavingsAccount) myaccount;
        mySavingsAccount.calculateInterest();
        System.out.println();

        //friend
        BankAccount friendsAccount = new SavingsAccount(1000);
        friendsAccount.credit(500);
        System.out.println("friends account initial balance is "+friendsAccount.getBalance());

        SavingsAccount friendsSavingsAccount = (SavingsAccount) friendsAccount;
        friendsSavingsAccount.calculateInterest();
        System.out.println();

//        myaccount.transfer(500,friendsAccount);
//        System.out.println("my balance after transferring to friend is "+myaccount.getBalance());
//        System.out.println("friend's balance after transferring is "+friendsAccount.getBalance());
//        System.out.println();

//        //mom
        BankAccount momsAccount = new SavingsAccount(3330);
        momsAccount.credit(700);
        System.out.println("mom account initial balance is "+momsAccount.getBalance());

        SavingsAccount momsSavingsAccount = (SavingsAccount) momsAccount;
        momsSavingsAccount.calculateInterest();
        System.out.println();

//        myaccount.transfer(500,momsAccount);
//        System.out.println("my balance after transferring to mom is "+myaccount.getBalance());
//        System.out.println("mom's balance after transferring is "+momsAccount.getBalance());
//        System.out.println();

//        //dad
        BankAccount dadsAccount = new SavingsAccount();
        dadsAccount.credit(500);
        System.out.println("dad account initial balance is "+dadsAccount.getBalance());

        SavingsAccount dadsSavingsAccount = (SavingsAccount) dadsAccount;
        dadsSavingsAccount.calculateInterest();
        System.out.println();
//
//        myaccount.transfer(500,dadsAccount);
//        System.out.println("my balance after transferring to dad is "+myaccount.getBalance());
//        System.out.println("dad's balance after transferring is "+dadsAccount.getBalance());
//        System.out.println();

//        //sister
//        BankAccount sisterAccount = new SavingsAccount();
//        sisterAccount.credit(500);
//        System.out.println("sister's account initial balance is "+sisterAccount.getBalance());
//        myaccount.transfer(500,sisterAccount);
//        System.out.println("my balance after transferring to sister is "+myaccount.getBalance());
//        System.out.println("sister's balance after transferring is "+sisterAccount.getBalance());
//        System.out.println();

//        //bro
//        BankAccount broAccount = new SavingsAccount();
//        broAccount.credit(500);
//        System.out.println("bro account initial balance is "+broAccount.getBalance());
//
//        myaccount.transfer(500,broAccount);
//        System.out.println("my balance after transferring is "+myaccount.getBalance());
//        System.out.println("bro balance after transferring is "+broAccount.getBalance());
//        System.out.println();


//        //nephew
//        BankAccount nephewAccount = new SavingsAccount();
//        nephewAccount.credit(500);
//        System.out.println("nephew's account initial balance is "+nephewAccount.getBalance());
//
//        myaccount.transfer(500,nephewAccount);
//        System.out.println("my balance after transferring to nephew is "+myaccount.getBalance());
//        System.out.println("nephew's balance after transferring is "+nephewAccount.getBalance());
//        System.out.println();


//        //friend1
//        BankAccount friend1Account = new SavingsAccount();
//        friend1Account.credit(500);
//        System.out.println("friend1's initial balance is "+friend1Account.getBalance());
//
//        myaccount.transfer(500,friend1Account);
//        System.out.println("my balance after transferring to friend1 is "+myaccount.getBalance());
//        System.out.println("friend1's balance after transferring is "+friend1Account.getBalance());
//        System.out.println();


//        //bigbrother
//        BankAccount bigbrotherAccount = new SavingsAccount();
//        bigbrotherAccount.credit(1000);
//        System.out.println("big brother's initial balance is "+bigbrotherAccount.getBalance());
//
//        myaccount.transfer(500,bigbrotherAccount);
//        System.out.println("my balance after transferring to big brother is "+myaccount.getBalance());
//        System.out.println("big brother's balance after transferring is "+bigbrotherAccount.getBalance());
//        System.out.println();


//        //big sister
//        BankAccount bigsisterAccount = new SavingsAccount();
//        bigsisterAccount.credit(1500);
//        System.out.println("big sister initial balance is " +bigsisterAccount.getBalance());
//
//        myaccount.transfer(500,bigsisterAccount);
//        System.out.println("my balance after transferring to big-sister is "+myaccount.getBalance());
//        System.out.println("big-sister's balance after transferring is "+bigsisterAccount.getBalance());
//        System.out.println();
//
//        //pavan
//        BankAccount pavansAccount = new SavingsAccount();
//        pavansAccount.credit(500);
//        System.out.println("pavan's initial balance is "+pavansAccount.getBalance());
//
//        myaccount.transfer(1000,pavansAccount);
//        System.out.println("my balance after transferring to pavan is "+myaccount.getBalance());
//        System.out.println("pavan's balance after transferring is "+pavansAccount.getBalance());
//        System.out.println();

//        //gagan
//        BankAccount gagansAccount = new SavingsAccount();
//        gagansAccount.credit(500);
//        System.out.println("gagan's initial balance is "+gagansAccount.getBalance());
//
//        myaccount.transfer(1000,gagansAccount);
//        System.out.println("my balance after transferring to gagan is "+myaccount.getBalance());
//        System.out.println("gagan's balance after transferring is "+gagansAccount.getBalance());
//        System.out.println();




    }
}
