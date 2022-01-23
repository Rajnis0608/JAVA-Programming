package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<String,Integer> hm =  new HashMap<>();
        hm.put("abc",5);
        hm.put("abc",8);
        System.out.println(hm);
    }
}
