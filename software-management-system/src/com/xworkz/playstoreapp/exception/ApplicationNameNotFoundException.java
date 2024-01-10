package com.xworkz.playstoreapp.exception;

public class ApplicationNameNotFoundException extends RuntimeException{

    public ApplicationNameNotFoundException(String errorMsg){
        System.out.println(errorMsg);
    }
}
