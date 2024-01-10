package com.xworkz.productsapp.exception;

public class UpdationFailedException extends Exception{
    public UpdationFailedException(String error){
        System.out.println(error);
    }
}
