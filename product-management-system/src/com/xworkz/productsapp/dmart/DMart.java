package com.xworkz.productsapp.dmart;

import com.xworkz.productsapp.product.Product;
import com.xworkz.productsapp.supermarket.SuperMarket;

import java.util.Arrays;

public class DMart extends SuperMarket {

    Product products[] ;
    int index = 0;

    public DMart(int productsCount){
        products = new Product[productsCount];
    }

    public boolean addProduct(Product product){
        boolean isAdded = false;
        int productId = 1;
        if(product != null){
            product.setProductId(productId++);
            this.products[index++] = product;
            System.out.println("Product added successfully");
            isAdded = true;
        }
        return isAdded;
    }

    public void getAllProducts(){
        for (int i = 0; i < this.products.length; i++) {
            System.out.println("ID: " + products[i].getProductId() +
                    "Name: " + products[i].getProductName() +
                    "Type: " + products[i].getProductType() +
                    "Company: " + products[i].getCompanyName() +
                    "Mfg-Date: " + products[i].getMfgDate() +
                    "EXP-Date: " + products[i].getExpDate() +
                    "Country: " + products[i].getManufacturedCountry()+
                    "Price: " + products[i].getPrice());
        }
    }

    public Product getProductInfoByName(String productName){
        Product newProduct = null;
        for (int i = 0; i < this.products.length; i++) {
            if(products[i].getProductName().equals(productName)){
                newProduct = products[i];
            }
        }
        return newProduct;
    }

    public String[] getProductNamesByCompanyName(String companyName){
        String[] productNames = new String[this.products.length];
        int index = 0;

        for (int i = 0; i < this.products.length; i++) {
            if(products[i].getCompanyName().equals(companyName)){
                productNames[index++] = products[i].getProductName();
            }
        }
        return productNames;
    }

    public boolean updateMfgAndExpDatesByProductName(String productName, String mfgDate, String expDate){
        boolean isUpdated = false;
        for (int i = 0; i < this.products.length; i++) {
            if(products[i].getProductName().equals(productName)){
                products[i].setMfgDate(mfgDate);
                products[i].setExpDate(expDate);
                System.out.println("Details updated successfully");
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public boolean updatePriceByProductName(String productName, double productPrice){
        boolean isUpdated = false;
        for (int i = 0; i < this.products.length; i++) {
            if(products[i].getPrice() == productPrice){
                products[i].setPrice(productPrice);
                System.out.println("Details updated successfully");
                isUpdated = true;
            }
        }
        return isUpdated;
    }

    public void deleteProductByExpDate(String productExpDate){
        int index = 0;
        for (int i = 0; i < this.products.length; i++) {
            if(!products[i].getExpDate().equals(productExpDate)){
                products[index++] = products[i];
            }
            else{
                System.out.println("Product deleted successfully and it's details are: ");
                System.out.println("ID: " + products[i].getProductId() +
                        "Name: " + products[i].getProductName() +
                        "Type: " + products[i].getProductType() +
                        "Company: " + products[i].getCompanyName() +
                        "Mfg-Date: " + products[i].getMfgDate() +
                        "EXP-Date: " + products[i].getExpDate());
            }
        }
        products = Arrays.copyOf(products,index);
    }

}

