package com.xworkz.collection.map;

import java.util.*;

public class HashMapExecutor {
    public static void main(String[] args) {
        Map<Integer , String>  hashMap = new HashMap<>();

        System.out.println(hashMap.put(1,"Salad"));
        System.out.println(hashMap.put(2,"Kachhori"));
        System.out.println(hashMap.put(1,"Salad"));
        hashMap.put(3,"Bread jam");
        hashMap.put(6,"Egg puffs");
        hashMap.put(5,"chicken");
        hashMap.put(4,"Gobi");
        System.out.println(hashMap.containsValue("Salad"));

        System.out.println(hashMap);
        System.out.println("value from get method is : "+hashMap.get(3));
        System.out.println(hashMap.remove(4));
        System.out.println(hashMap);

        Collection<String> list = hashMap.values();
        System.out.println(list);

        Set<Map.Entry<Integer , String>> set = hashMap.entrySet();

        for(Map.Entry<Integer,String> entry: set){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }


    }
}
