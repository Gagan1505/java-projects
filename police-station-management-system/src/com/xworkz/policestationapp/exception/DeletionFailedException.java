package com.xworkz.policestationapp.exception;

public class DeletionFailedException extends RuntimeException{
    public DeletionFailedException(String error){
        System.out.println(error);
    }
}
