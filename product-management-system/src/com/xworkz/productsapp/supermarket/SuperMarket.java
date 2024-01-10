package com.xworkz.productsapp.supermarket;

import com.xworkz.productsapp.product.Product;

import java.util.List;

public interface SuperMarket {

    public boolean addProduct(Product product);

    public void getAllProducts();

    public Product getProductInfoByName(String productName);

    public List<String> getProductNamesByCompanyName(String companyName);

    public boolean updateMfgAndExpDatesByProductName(String productName, String mfgDate, String expDate);

    public boolean updatePriceByProductName(String productName, double productPrice);

    public void deleteProductByExpDate(String productExpDate);
}
