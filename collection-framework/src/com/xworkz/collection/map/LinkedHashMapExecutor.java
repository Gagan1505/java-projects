package com.xworkz.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExecutor {

    public static void main(String[] args) {
        Map<Integer , String> linkedHashMap = new LinkedHashMap<>();


        linkedHashMap.put(2,"Kachhori");
        linkedHashMap.put(3,"Bread jam");
        linkedHashMap.put(6,"Egg puffs");
        linkedHashMap.put(4,"Gobi");
        linkedHashMap.put(5,"chicken");
        linkedHashMap.put(1,"Salad");

        System.out.println(linkedHashMap);

        Set<Map.Entry<Integer,String>> set = linkedHashMap.entrySet();

        for(Map.Entry<Integer,String> entry:set){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

    }
}
