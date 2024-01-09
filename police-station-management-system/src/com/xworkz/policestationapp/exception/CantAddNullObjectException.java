package com.xworkz.policestationapp.exception;

public class CantAddNullObjectException extends RuntimeException{
    public CantAddNullObjectException(String error){
        System.out.println(error);
    }
}
