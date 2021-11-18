package com.company;

import java.util.ArrayDeque;

public class Dequeues {
    public static void main(String[] args) {
        //perform all the operations from front and last
        ArrayDeque<Integer>dq = new ArrayDeque<>();
        dq.offer(2); //insert back
        dq.offerLast(3); //insert back
        dq.offerFirst(1); //insert front
        System.out.println(dq.peekFirst()); //first element
        System.out.println(dq.peekLast()); //last element
        dq.poll(); //remove front
        dq.pollFirst(); //remove from front
        dq.pollLast(); //remove from last
    }
}
