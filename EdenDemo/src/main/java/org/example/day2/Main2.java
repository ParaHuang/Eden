package org.example.day2;

import java.util.HashSet;
import java.util.Objects;

public class Main2 {
    public static void main(String[] args) {
        //unique value
        HashSet<Student> set = new HashSet<>();
        //comparing two element:  equals + hashCode
        //new -> create
        set.add(new Student("hello"));
        set.add(new Student("hey"));
        set.add(new Student("Jack"));
        set.add(new Student("hey"));
        set.add(new Student("hello"));
        System.out.println(set);

        Student s1 = new Student("Jack");
        Student s2 = new Student("Jack");
        System.out.println(s1.equals(s2));  //comparing content

        String sr1 = new String("Jack");
        String sr2 = new String("Jack");
        System.out.println(sr1.equals(sr2));//comparing content

        System.out.println();
        System.out.println(s1.equals(s1));      //true
        System.out.println(s1.equals(null));    //false
        System.out.println(s1.equals(12));      //false
    }
}

class Student implements Comparable{
   private String name;
   private int age;

    public Student(String name) {
        this.name = name;
    }
    public Student(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return ""+age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        //for to define the rule of comparing 2 students
        //this    vs     o
        Student s = (Student) o;
//        return name.compareTo(s.name);
        return age - s.age;
    }
}