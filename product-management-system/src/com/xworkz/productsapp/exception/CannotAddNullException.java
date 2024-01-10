package com.xworkz.productsapp.exception;

public class CannotAddNullException extends Exception{
    public CannotAddNullException(String error){
        System.out.println(error);
    }
}
