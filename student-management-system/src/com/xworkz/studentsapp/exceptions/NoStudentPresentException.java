package com.xworkz.studentsapp.exceptions;

public class NoStudentPresentException extends RuntimeException{
    public NoStudentPresentException(String error){
        System.out.println("No student present with "+error);
    }
}
