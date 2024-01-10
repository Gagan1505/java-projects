package com.xworkz.playstoreapp.exception;

public class ApplicationIdNotFoundException extends RuntimeException{
    public ApplicationIdNotFoundException(String errorMsg){
        System.out.println(errorMsg);
    }
}
