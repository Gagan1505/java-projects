package com.xworkz.policestationapp.exception;

public class OfficerNotFoundException extends RuntimeException{
    public OfficerNotFoundException(String error){
        System.out.println(error);
    }
}
