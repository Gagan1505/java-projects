package com.xworkz.policestationapp.exception;

public class OfficerNameNotFoundException extends RuntimeException{
    public OfficerNameNotFoundException(String error){
        System.out.println(error);
    }
}
