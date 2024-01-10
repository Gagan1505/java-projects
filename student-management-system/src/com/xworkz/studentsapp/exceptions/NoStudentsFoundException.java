package com.xworkz.studentsapp.exceptions;

public class NoStudentsFoundException extends RuntimeException{
    public NoStudentsFoundException(){
        System.out.println("No student details are present to display");
    }
}
