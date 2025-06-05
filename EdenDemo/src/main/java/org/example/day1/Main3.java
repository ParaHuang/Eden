package org.example.day1;

public class Main3 {
    public static void main(String[] args) {
        //0.00023234    ->  0
        //0.12384203    ->  1
        //0.7293824     ->  7
        double originNumber = Math.random();
        System.out.println(originNumber);
        System.out.println(originNumber*10);
        System.out.println((int)(originNumber*10));
//        System.out.println((int)(Math.random()*10));
    }
}
