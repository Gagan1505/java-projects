package com.xworkz.productsapp.exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(){
        System.out.println("No Product present");
    }
}
