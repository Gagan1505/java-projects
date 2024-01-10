package com.xworkz.productsapp.supermarket.impl;

import com.xworkz.productsapp.exception.*;
import com.xworkz.productsapp.product.Product;
import com.xworkz.productsapp.supermarket.SuperMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DMartImpl implements SuperMarket {

    List<Product> products = new ArrayList<>();
    int index = 0;

    public DMartImpl(){

    }

    @Override
    public boolean addProduct(Product product){
        boolean isAdded = false;
        int productId = 1;
        try {
            if (product != null) {
                product.setProductId(productId++);
                products.add(product);
                System.out.println("Product added successfully");
                isAdded = true;
            }else{
                throw new CannotAddNullException("---------------- Don't add null object---------------");
            }
        }catch(CannotAddNullException e){
            e.printStackTrace();
        }
        return isAdded;
    }

    @Override
    public void getAllProducts(){
        try {
            if(products.size() > 0){
                for (Product product : products){
                    System.out.println("Products details are ");
                    System.out.println(product);
                }
            }
            else{
                throw new ProductNotFoundException();
            }
        }catch(ProductNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public Product getProductInfoByName(String productName){
        Product newProduct = null;
        try{
            if(products.size() > 0){
                for(Product product : products){
                    if(product.getProductName().equals(productName)){
                        newProduct = product;
                        System.out.println("Product found --- ");
                    }else{
                        throw new ProductNameNotFoundException();
                    }
                }
            }else{
                throw new ProductNotFoundException();
            }
        }catch(ProductNotFoundException | ProductNameNotFoundException e){
            e.printStackTrace();
        }
        return newProduct;
    }

    @Override
    public List<String> getProductNamesByCompanyName(String companyName){
        List<String> productNames = new ArrayList<>();
        int index = 0;

        try{
            if(products.size() > 0){
                for (Product product : products){
                    if(product.getCompanyName().equals(companyName)){
                        productNames.add(product.getProductName());
                    }
                }
            }else{
                throw new ProductNotFoundException();
            }
        }catch(ProductNotFoundException e){
            e.printStackTrace();
        }
        return productNames;
    }

    @Override
    public boolean updateMfgAndExpDatesByProductName(String productName, String mfgDate, String expDate){
        boolean isUpdated = false;
        try {
            if(products.size() > 0){
                for (Product product : products){
                    if(product.getProductName().equals(productName)){
                        product.setMfgDate(mfgDate);
                        product.setExpDate(expDate);
                        System.out.println("Updated successfully ");
                        isUpdated = true;
                    }
                }
            } else {
                throw new ProductNotFoundException();
            }
            if(isUpdated==false){
                throw new UpdationFailedException("--------------Failed to update----------------");
            }
        }catch(UpdationFailedException e){
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updatePriceByProductName(String productName, double productPrice){
        boolean isUpdated = false;
        try {
            if(products.size() > 0){
                for (Product product : products){
                    if(product.getProductName().equals(productName)){
                        product.setPrice(productPrice);
                        isUpdated = true;
                        System.out.println("Updated successfully");
                    }
                }
                if(isUpdated==false){
                    throw new UpdationFailedException("--------------Failed to update----------------");
                }
            }else{
                throw new ProductNotFoundException();
            }
        }catch(UpdationFailedException | ProductNotFoundException e){
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public void deleteProductByExpDate(String productExpDate){
        boolean isDeleted = false;
        try{
            if(products.size() > 0){
                for (Product product : products){
                    if(product.getExpDate().equals(productExpDate)){
                        products.remove(product);
                        System.out.println("Product deleted successfully");
                        isDeleted = true;
                    }
                }
                if(isDeleted == false){
                    throw new DeletionFailedException();
                }
            }else{
                throw new ProductNotFoundException();
            }
        }catch(ProductNotFoundException e){
            e.printStackTrace();
        }
    }

}

