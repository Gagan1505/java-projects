package com.xworkz.productsapp.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    private int productId;
    private String productName;
    private String productType;
    private String companyName;
    private String manufacturedCountry;
    private String mfgDate;
    private String expDate;
    private double price;

}
