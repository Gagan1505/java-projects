package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

//list --- sub-interface of collection ----- index based collection ----- preserve the insertion order ----- allows duplicate values ---- allows to add null objects --
//hashset                                                                   - does-not preserve the insertion order ---- doesn't allows duplicates ---

public class CollectionExecutor {

    public static void main(String[] args) {

        Collection collection1 = new ArrayList();
        collection1.add("Paneer roll");
        collection1.add("Coffee");
        collection1.add("Momo's");
        collection1.add("Maggie");

        Collection collection = new LinkedList();
        collection.add("Paneer roll");
        collection.add("Tea");
        collection.add("Momo's");
        collection.add(3);

        collection.add(collection1);
        System.out.println(collection.containsAll(collection1));

        System.out.println(collection.size());
        System.out.println("-----------");
        collection.removeAll(collection);
        System.out.println(collection.size());
        System.out.println("-----------");

        collection.addAll(collection1);
        System.out.println(collection);
        System.out.println("-----------");

        //for each is used to process/read the data from the collection.............
        for(Object e:collection){
            System.out.println(e.toString());
        }
        System.out.println("-----------");

        System.out.println(collection.contains("Momo's"));
        System.out.println(collection.containsAll(collection1));
        System.out.println(collection.equals(new String("Momo's")));

        System.out.println("-----------");
        System.out.println(collection.size());
        System.out.println(collection1.size());

    }
}
