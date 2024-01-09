package com.xworkz.customcollections.executors;

import com.xworkz.customcollections.customclasses.App;
import com.xworkz.customcollections.customclasses.Product;
import com.xworkz.customcollections.customclasses.Shop;

import java.util.HashSet;
import java.util.Set;

public class HashSetExecutor {
    public static void main(String[] args) {

        Set set1 = new HashSet();
//        set1.add(new App(1,"WhatsApp","Social - media"));
//        set1.add(new App(1,"WhatsApp","Social - media"));
//        set1.add(new App(2,"Instagram","Social - media"));
        set1.add(new Shop(11,"Mobile shop","Accessories"));
        set1.add(new Shop(12,"Fruit shop","Food"));
        set1.add(new Product(101,"Toy car","Toys"));
        set1.add(new Product(102,"Water can","Utilities"));
        set1.add(null);
        set1.add(null);
        for(Object e:set1){
            System.out.println(e);
        }

        System.out.println("----------------------------------------------------------------------------");

    }
}
