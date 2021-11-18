package com.company;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {
        //Arrays.sort(array_name) to sort a given array
        //Arraylist is a dynamic array
        java.util.ArrayList<String> arr = new java.util.ArrayList<>();
        arr.add("Dewansh"); //inserting from last
        arr.add("and");
        arr.add("Rajni");
        arr.add("CodeChef");
        System.out.println(arr);

        arr.add(3,"Likes"); //inserting at perticular location
        System.out.println(arr);

        java.util.ArrayList<String> arr2 = new java.util.ArrayList<>();
        arr2.add("very");
        arr2.add("much");
        arr.addAll(arr2); //inserting an arrayList at the end of existing array
        System.out.println(arr);

        System.out.println(arr.get(0)); // fetch data at given index

        arr.remove(6); //removing element from particular index
        System.out.println(arr);
        arr.remove(String.valueOf("very")); //remove particular string from array
        System.out.println(arr);

        arr.set(3,"loves"); //to update value at particular index
        System.out.println(arr);

        System.out.println("Dewansh is present or not : " + arr.contains("Dewansh")); // to check if given value is present or not

        System.out.println("size of array is " + arr.size());

        arr.clear(); //to remove all the elements
        System.out.println(arr);
    }
}
