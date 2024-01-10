package com.xworkz.studentsapp.exceptions;

public class UpdationFailedException extends RuntimeException{
    public UpdationFailedException(){
        System.out.println("Updating details failed");
    }
}
