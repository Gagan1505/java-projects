package com.xworkz.policestationapp.exception;

public class InvalidIdException extends RuntimeException{
    public InvalidIdException(String error){
        System.out.println(error);
    }
}
