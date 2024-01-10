package com.xworkz.playstoreapp.exception;

public class ApplicationTypeNotFoundException extends Exception{
    public ApplicationTypeNotFoundException(String errorMsg){
        System.out.println(errorMsg);
    }
}
