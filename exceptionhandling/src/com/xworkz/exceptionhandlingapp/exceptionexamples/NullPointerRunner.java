package com.xworkz.exceptionhandlingapp.exceptionexamples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NullPointerRunner {

    public static void main(String[] args) {

        System.out.println("Main method started ");

        NullPointer nullPointer = new NullPointer();
        NullPointer nullPointer1 = null;

        try{
            System.out.println(nullPointer1.name);
        }catch(NullPointerException e){
            System.out.println("cannot fetch memebers of a null object");
        }

        System.out.println("Main method ended ");



    }
}
