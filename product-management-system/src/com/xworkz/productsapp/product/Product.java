package com.xworkz.productsapp.product;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

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
