package com.xworkz.playstoreapp.exception;

public class ApplicationNotFoundException extends RuntimeException{

    public ApplicationNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
