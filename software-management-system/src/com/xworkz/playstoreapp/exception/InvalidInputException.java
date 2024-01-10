package com.xworkz.playstoreapp.exception;

public class InvalidInputException extends RuntimeException{

    public InvalidInputException(String error){
        System.out.println(error);
    }
}
