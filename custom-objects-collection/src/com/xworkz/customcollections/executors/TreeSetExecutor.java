package com.xworkz.customcollections.executors;

import com.xworkz.customcollections.customclasses.App;
import com.xworkz.customcollections.customclasses.Product;
import com.xworkz.customcollections.customclasses.Shop;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExecutor {
    public static void main(String[] args) {

        Set set2 = new TreeSet();

        set2.add(new App(1,"WhatsApp","Social - media",24.56));
        set2.add(new App(2,"Instagram","Social - media",6.78));
        set2.add(new App(1,"WhatsApp","Social - media",24.56));
        set2.add(new App(5,"Twitter","Social - media",7.78));
//        set2.add(new Shop(11,"Mobile shop","Accessories"));
//        set2.add(new Shop(12,"Fruit shop","Food"));
//        set2.add(new Product(101,"Toy car","Toys"));
//        set2.add(new Product(102,"Water can","Utilities"));

        for(Object e:set2){
            System.out.println(e);
        }

        System.out.println("---------------------------------------------------------------------");

    }
}
