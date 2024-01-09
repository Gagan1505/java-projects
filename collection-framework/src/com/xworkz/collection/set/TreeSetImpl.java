package com.xworkz.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetImpl {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add("Vada pav");
        set.add("Kachori");
        set.add("Bread");
        set.add("Jam Bun");
        set.add("Gobi");
        set.add("Fried rice");
        set.add("Pani puri");
        set.add("Jam Bun");
        set.add("jam Bun");
        set.add("bread");

        System.out.println(set);
        System.out.println(set.size());

        set.remove("Jam Bun");
        System.out.println("After removing --------------");
        System.out.println(set);
        System.out.println(set.size());

//        set.add(null);

    }
}
