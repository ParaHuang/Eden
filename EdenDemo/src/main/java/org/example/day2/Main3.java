package org.example.day2;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>();
        //comparing two element:  equals + hashCode
        //new -> create
//        set.add(new Student("hello"));
//        set.add(new Student("hey"));
//        set.add(new Student("Jack"));
//        set.add(new Student("mike"));
//        set.add(new Student("alex"));

        set.add(new Student(12));
        set.add(new Student(33));
        set.add(new Student(22));
        set.add(new Student(31));
        set.add(new Student(9));
        System.out.println(set);

//        List<String> list = Arrays.asList("alex", "mike","hello","Jack", "hey");
//        Collections.sort(list);
//        System.out.println(list);
    }
}
