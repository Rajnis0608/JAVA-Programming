package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("likes");
        q.offer("Dewansh"); //add an element to queue
        q.offer("and");
        q.offer("Rajni");

        System.out.println(q.peek()); //first element
        q.poll(); //Remove all the elements
        System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.print(q.poll() + " ");
        }
        System.out.println();
        System.out.println("Is Queue empty:" + q.isEmpty());




    }
}
