package com.xworkz.policestationapp.exception;

public class OfficerAddressNotFoundException extends RuntimeException{
    public OfficerAddressNotFoundException(String error){
        System.out.println(error);
    }
}
