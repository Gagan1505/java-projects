package com.xworkz.policestationapp.exception;

public class PostNameNotFoundException extends RuntimeException{
    public PostNameNotFoundException(String error){
        System.out.println(error);
    }
}
