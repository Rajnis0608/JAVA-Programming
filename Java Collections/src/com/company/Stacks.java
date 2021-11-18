package com.company;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        //Uses LIFO
        Stack<String>s = new Stack<>();
        s.push("Dewansh"); //pushes element to stack
        s.push("and");
        s.push("Rajni");
        s.push("likes");
        System.out.println(s.peek()); //Topmost element
        s.pop();
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println("Is Stack empty:" + s.isEmpty());
        while(!s.isEmpty()){
            System.out.print(s.pop()+ " ");
        }

        //s.clear() to remove all the elements
        System.out.println();
        System.out.println("Is Stack empty:" + s.isEmpty());

    }
}
