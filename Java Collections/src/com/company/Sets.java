package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        // Hashset and treeset
        // hashset use hashing and have complexity O(1) and treeset use BST with complexity O(log(n))
        Set<Integer> set = new HashSet<>();
        //Set<Integer> set2 = new LinkedHashSet<>(); //to maintain order
        set.add(4);
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(8);
        set.add(7);
        System.out.println(set); //store data in any order and store unique data
        set.remove(3);
        System.out.println(set);
        System.out.println(set.contains(3));
        //isEmpty() , clear() , size() common in all

        Set<Integer> set2 = new TreeSet<>();
        //Set<Integer> set2 = new LinkedHashSet<>(); //to maintain order
        set2.add(4);
        set2.add(1);
        set2.add(3);
        set2.add(2);
        System.out.println(set2); //store data in any order and store unique data
        set2.remove(3);
        System.out.println(set2);
        System.out.println(set2.contains(3));
    }
}
