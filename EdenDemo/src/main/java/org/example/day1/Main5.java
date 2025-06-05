package org.example.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        String[] arr = {"Jhon","Lily","Jo","Alice","Jane","Mike","Linda","Cindy","Nate","Alex"};
        List<String> list = new ArrayList<>();
        for(String name:arr){
            list.add(name);
        }

//        Collections:a tool for Collection
        Collections.shuffle(list);
        for(int i=0 ; i<5 ; i++){
            System.out.println(list.get(i));
        }
    }
}
