package org.example.day3;

import java.util.*;

public class Main1_Map {
    public static void main(String[] args) {
        //Map-- HashMap,TreeMap,LinkedHashMap
        //key-value pair

        //"name"--"Jack"
        //"age"--19
        //"gender"--"male"

        //to save different information
        Map<String,Object> map = new HashMap<>();
        //1.put value with key into map
        map.put("gender","male");
        map.put("age",19);
        map.put("name","Jack");
        map.put("name","Mike");
        //2.get value by key
        Object value1 = map.get("name");
        System.out.println(value1);
        Object value2 = map.get("age");
        System.out.println(value2);
        Object value3 = map.get("gender");
        System.out.println(value3);
        Object value4 = map.get("test");//null,because test doesn't exist as a key
        System.out.println(value4);
        //3.
        System.out.println(map);
        System.out.println(map.size());
        //4.get all the keys,save them in a set
        Set<String> set = map.keySet();
        System.out.println(set);
        for(String key:set){
            System.out.println(key +"---"+map.get(key));
        }
        //5.contains
        System.out.println(map.containsKey("name"));
        System.out.println(map.containsValue("Mike"));




        /*
        //suggestion:use list to save same type information , or information with same meanfuling
        List<Object> list = new ArrayList<>();
        list.add(19);
        list.add("male");
        list.add("Jack");

        System.out.println("name:"+list.get(0));
         */
    }
}
