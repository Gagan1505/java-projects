package com.xworkz.customcollections.executors;

import com.xworkz.customcollections.customclasses.App;
import com.xworkz.customcollections.customclasses.Product;
import com.xworkz.customcollections.customclasses.Shop;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExecutor {
    public static void main(String[] args) {
        List list = new ArrayList();

//        list.add(new App(1,"WhatsApp","Social - media"));
//        list.add(new App(1,"WhatsApp","Social - media"));
//        list.add(new App(2,"Instagram","Social - media"));
        list.add(new Shop(11,"Mobile shop","Accessories"));
        list.add(new Shop(12,"Fruit shop","Food"));
        list.add(new Product(101,"Toy car","Toys"));
        list.add(new Product(102,"Water can","Utilities"));
        list.add(null);
        list.add(null);

        for(Object e:list){
            System.out.println(e);
        }

        System.out.println("---------------------------------------------------------------------------");
    }
}
