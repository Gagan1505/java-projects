package com.xworkz.productsapp.exception;

public class ProductNameNotFoundException extends RuntimeException{
    public ProductNameNotFoundException(){
        System.out.println("No product with entered name is present");
    }
}
