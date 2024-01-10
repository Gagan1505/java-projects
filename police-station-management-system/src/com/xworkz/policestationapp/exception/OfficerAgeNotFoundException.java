package com.xworkz.policestationapp.exception;

public class OfficerAgeNotFoundException extends RuntimeException{
    public OfficerAgeNotFoundException(String error){
        System.out.println(error);
    }
}
