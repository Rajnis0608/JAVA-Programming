package com.company;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // Store data in key:value pair in sorted order of key
        // all the keys are unique and values may be duplicates
        Map<String,Integer> m = new HashMap<>();
        m.put("One",1); //insertion
        m.put("Two",2);
        m.put("Three",3);
        System.out.println(m);
        System.out.println(m.containsKey("One")); //to check if given key present or not
        System.out.println(m.containsValue("Four"));
        System.out.println(m.containsValue(1)); //to check if given value present or not
        System.out.println(m.containsValue(4));
        System.out.println(m);
        m.put("One",5); //will replace ("One",1)
        System.out.println(m);
        m.put("four",2);
        System.out.println(m);
        for(String s : m.keySet()){
            System.out.print(s + " ");
        }

        for(Integer i : m.values()){
            System.out.print(i + " ");
        }
    }
}
