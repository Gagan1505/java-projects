package com.xworkz.productsapp.exception;

public class PriceUpdationFailedException extends RuntimeException{
    public PriceUpdationFailedException(){
        System.out.println("Updating price failed");
    }
}
