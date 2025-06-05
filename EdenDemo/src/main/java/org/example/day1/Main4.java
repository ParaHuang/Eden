package org.example.day1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) {
        Random rd = new Random();
        String[] arr = {"Jhon","Lily","Jo","Alice","Jane","Mike","Linda","Cindy","Nate","Alex"};
        Set<String> set = new HashSet<>();      //to save the random people who are invited

        while(set.size()<5){
            int index = rd.nextInt(10);
            System.out.println(arr[index]);
            set.add(arr[index]);
        }
        System.out.println(set);
    }
}
