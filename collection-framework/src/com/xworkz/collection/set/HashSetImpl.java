package com.xworkz.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetImpl {
    public static void main(String[] args) {

        Set set = new HashSet();
        set.add("Vada pav");
        set.add("Kachori");
        set.add("Bread");
        set.add("Jam Bun");
        set.add("Gobi");
        set.add("Fried rice");
        set.add("Pani puri");
        set.add("Jam Bun");
        set.add("Bread");
        set.add(null);
        set.add(null);

        System.out.println(set);
        System.out.println(set.size());

        set.remove("Jam Bun");
        System.out.println("After removing --------------");
        System.out.println(set);
        System.out.println(set.size());

    }
}
