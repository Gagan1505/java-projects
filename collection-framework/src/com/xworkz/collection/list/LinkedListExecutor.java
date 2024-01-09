package com.xworkz.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExecutor {

    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("Vada pav");
        list.add("Kachori");
        list.add("Bread");
        list.add("Jam Bun");
        list.add("Gobi");
        list.add("Fried rice");
        list.add("Pani puri");
        list.add("Jam Bun");
        list.add(null);
        list.add(null);

        System.out.println(list);
        System.out.println(list.size());

        list.add(5,"Samosa");
        System.out.println("After adding -------------- ");
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("After removing by remove() function -----");
        list.remove("Jam Bun");
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("After removing by remove() at particular index  -----");
        list.remove(9);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.get(3));


    }
}
