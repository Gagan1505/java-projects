package com.xworkz.exceptionhandlingapp.exceptionexamples;

public class ArithematicExcpt {
    public static void main(String[] args) {

        System.out.println("Main started");
        try{
            System.out.println(7/0);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide a number by zero");
        }
        System.out.println("Main ended");
    }
}
