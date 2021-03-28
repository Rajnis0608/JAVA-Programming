package com.javalearning;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String , String> lang  = new HashMap<>();
        lang.put("abc","initial value");
        lang.put("abc","updated value");
        lang.put("xyz","initial xyz");
        for(String key : lang.keySet()){
            System.out.println(key + " : " + lang.get(key));
        }
        lang.remove("abc","updated value");
        for(String key : lang.keySet()){
            System.out.println(key + " : " + lang.get(key));
        }
    }
}
