package com.xworkz.playstoreapp.exception;

public class CannotAddNullException extends RuntimeException{
    public CannotAddNullException(String error){
        System.out.println(error);
    }

}
