package org.example.day3;

import java.util.*;

public class Main2_Map {
    public static void main(String[] args) {
        //China     --      Beijing,Shanghai,Shenzhen,Guangzhou
        //America   --      Chicago,Alaska,New York
        //UK        --      London,Liverpool,.......

        //key:country Name   value: array of cities
        Map<String, String[]> map = new HashMap<>();
        map.put("China", new String[]{"Beijing","Shanghai","Shenzhen","Guangzhou"});
        map.put("America",new String[]{"Chicago","Alaska","New York","Los Angeles"});
        map.put("UK",new String[]{"London","Liverpool","Manchester","Birmingham"});

        System.out.println("where are you from?");
        Set<String> set = map.keySet();
        for (String key:set){
            System.out.print(key+" ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String country = scanner.next();    //treat it as key
        String[] cities = map.get(country);
//        System.out.println(cities);


    }
}
