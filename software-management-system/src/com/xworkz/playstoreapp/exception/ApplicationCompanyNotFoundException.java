package com.xworkz.playstoreapp.exception;

public class ApplicationCompanyNotFoundException extends RuntimeException{
    public ApplicationCompanyNotFoundException(String errorMsg){
        System.out.println(errorMsg);
    }
}
