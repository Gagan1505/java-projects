package com.xworkz.productsapp.exception;

import java.util.Collection;

public class DeletionFailedException extends RuntimeException{
    public DeletionFailedException(){
        System.out.println("Deleting records failed --- ");
    }
}
