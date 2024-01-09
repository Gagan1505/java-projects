package com.xworkz.customcollections.executors;

import com.xworkz.customcollections.customclasses.App;
import com.xworkz.customcollections.customclasses.Product;
import com.xworkz.customcollections.customclasses.Shop;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExecutor {
    public static void main(String[] args) {

        Queue queue = new PriorityQueue();

        queue.add(new App(1,"WhatsApp","Social - media",23.56));
        queue.add(new App(1,"WhatsApp","Social - media",23.56));
        queue.add(new App(2,"Instagram","Social - media",768));
        queue.add(new App(5,"Twitter","Social - media",7.78));
        queue.add(new App(1,"WhatsApp","Social - media",63.56));
//        queue.add(new Shop(11,"Mobile shop","Accessories"));
//        queue.add(new Shop(12,"Fruit shop","Food"));
//        queue.add(new Product(101,"Toy car","Toys"));
//        queue.add(new Product(102,"Water can","Utilities"));

        for(Object e:queue){
            System.out.println(e);
        }

        System.out.println("---------------------------------------------------------------------------");

    }
}
