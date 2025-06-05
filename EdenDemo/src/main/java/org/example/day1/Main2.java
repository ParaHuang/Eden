package org.example.day1;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
//        Jhon","Lily","Jo","Alice","Jane","Mike","Linda","Cindy","Nate","Will come to join a party"," but only 5 of them allowed to join
//        write a program"," which can generate 5 people randomly to join to party
//        (more than 1 way to solve it"," with set or not are both fine)
        String[] arr = {"Jhon","Lily","Jo","Alice","Jane","Mike","Linda","Cindy","Nate","Alex"};
        List<String> list = new ArrayList<>();
        for(String name:arr){
            list.add(name);
        }

        for(int i=0 ; i<5 ; i++){
            int index = (int)(Math.random()*list.size());
            System.out.println(list.get(index));
            list.remove(index);
        }

    }
}
