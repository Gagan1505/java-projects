package com.xworkz.productsapp;
import com.xworkz.productsapp.supermarket.SuperMarket;
import com.xworkz.productsapp.supermarket.impl.DMartImpl;
import com.xworkz.productsapp.product.Product;

import java.util.Scanner;

public class ProductExecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products to add : ");
        int productCount = sc.nextInt();

        SuperMarket dMart = new DMartImpl();
        try {

            for (int i = 0; i < productCount; i++) {
                Product product = new Product();

                System.out.println("Enter the product " + (i + 1) + "'s name: ");
                product.setProductName(sc.next());

                System.out.println("Enter the type of the product " + (i + 1) + ": ");
                product.setProductType(sc.next());

                System.out.println("Enter the product " + (i + 1) + "'s company name: ");
                product.setCompanyName(sc.next());

                System.out.println("Enter the product " + (i + 1) + "'s manufactured date: ");
                product.setMfgDate(sc.next());

                System.out.println("Enter the product " + (i + 1) + "'s manufactured country: ");
                product.setManufacturedCountry(sc.next());

                System.out.println("Enter the product " + (i + 1) + "'s expiry date: ");
                product.setMfgDate(sc.next());

                System.out.println("Enter the product " + (i + 1) + "'s price: ");
                product.setPrice(sc.nextDouble());

                dMart.addProduct(product);
            }

            String input = null;

            do {
                System.out.println("-------------------------------------------------------");
                System.out.println("Enter ");
                System.out.println("1 -> To get all products details ");
                System.out.println("2 -> To get product details using product name");
                System.out.println("3 -> To get products names manufactured by a company");
                System.out.println("4 -> To update manufacture date and expiry date of a product");
                System.out.println("5 -> To delete a product that has expired");
                int option = sc.nextInt();

                try {
                    switch (option) {
                        case 1:
                            dMart.getAllProducts();
                            break;

                        case 2:
                            System.out.println("Enter the product name to get it's details: ");
                            Product newProduct = dMart.getProductInfoByName(sc.next());
                            System.out.println(newProduct);
                            break;

                        case 3:
                            System.out.println("Enter the company name to get products manufactured by it: ");
                            for(String names : dMart.getProductNamesByCompanyName(sc.nextLine())){
                                System.out.println(names);
                            }
                            break;

                        case 4:
                            System.out.println("Enter the product name, new manufactured date and new expiry date to update: ");
                            dMart.updateMfgAndExpDatesByProductName(sc.next(), sc.next(), sc.next());
                            break;

                        case 5:
                            System.out.println("Enter the expiry date of a product to delete: ");
                            dMart.deleteProductByExpDate(sc.next());
                            break;

                        default:
                            System.out.println("INVALID INPUT --- ENTER VALID OPTION FROM ABOVE ---");
                    }

                    System.out.println("Want to continue ? Y/N --");
                    input = sc.next();
                } catch (NullPointerException e) {
                    System.out.println("----------------------Cannot access null object----------------------");
                }
            } while (input.equals("Y"));

            System.out.println("THANK YOU !!! --------- VISIT AGAIN ------");
        }
        finally{
            sc.close();
        }
    }
}
