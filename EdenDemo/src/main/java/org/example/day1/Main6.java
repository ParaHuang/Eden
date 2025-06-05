package org.example.day1;

import java.util.Random;

public class Main6 {
    public static void main(String[] args) {
        Random rd = new Random();
//        int x = rd.nextInt();
//        int x = rd.nextInt(10);      //0~bound-1
        int x = rd.nextInt(5,10);//origin ~bound-1
        System.out.println(x);
    }
}
