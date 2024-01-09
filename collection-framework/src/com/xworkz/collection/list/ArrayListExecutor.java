package com.xworkz.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExecutor {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Virat Kohli");
        list.add("Sourav Ganguly");
        list.add("Rohith Sharma");
        list.add("Ronaldo");
        list.add("Mike Tyson");
        list.add("Messi");
        list.add("Brock Lesnor");
        list.add("Rohith Sharma");

        System.out.println(list);
        System.out.println(list.size());

        list.add(3,"Smrithi");
        list.add(null);
        System.out.println("List after adding --------");
        System.out.println(list);
        System.out.println(list.size());


        System.out.println("Data at 7th position is : "+list.get(7));

    }
}
