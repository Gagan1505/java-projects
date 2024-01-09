package com.xworkz.collection.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExecutor {

    public static void main(String[] args) {
        Map<Integer , String> treeMap = new TreeMap<>();


        treeMap.put(1,"Salad");
        treeMap.put(2,"Kachhori");
        treeMap.put(3,"Bread jam");
        treeMap.put(6,"Egg puffs");
        treeMap.put(5,"chicken");
        treeMap.put(4,"Gobi");

        System.out.println(treeMap);

        Set<Map.Entry<Integer,String>> set = treeMap.entrySet();

        for(Map.Entry<Integer,String> entry:set){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }
}
