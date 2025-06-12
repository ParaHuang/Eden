package org.example.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        //1.basic use of Set
        //2.different types of Set
//        Set<Integer> set = new HashSet<>();   //no order
//        Set<Integer> set = new TreeSet<>();           //natural order
        Set<Integer> set = new LinkedHashSet<>();     //natural order

        set.add(44);
        set.add(33);
        set.add(11);
        set.add(22);
        set.add(11);
        System.out.println(set);

        //3.the generic of Set is the class we defined
    }
}
