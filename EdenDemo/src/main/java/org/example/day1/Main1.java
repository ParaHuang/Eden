package org.example.day1;

import java.util.HashSet;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        /*
         Collection
            |
         ---------------------
         |                  |
         List               Set
         |                  |
         ArrayList          HashSet
         LinkedList         TreeSet
                            LinkedHashSet

         */
        //1.save unique value    2.has no index
        Set<Integer> set = new HashSet<>();     //has no order

        //add a value into set
        set.add(12);
        set.add(89);
        set.add(77);
        set.add(55);
        set.add(89);
        set.add(77);

        //get the size of set
        System.out.println(set.size());

        //get a value
        for(int x:set){
            System.out.println(x);
        }

        //remove a value
        boolean f = set.remove(155);
        System.out.println(f+"---"+set);

        //to check if set contains value
        System.out.println(set.contains(55));

    }
}
