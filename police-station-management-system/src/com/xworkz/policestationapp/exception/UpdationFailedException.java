package com.xworkz.policestationapp.exception;

public class UpdationFailedException extends RuntimeException{
    public UpdationFailedException(String error){
        System.out.println(error);
    }
}
