package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        //Implementation of PQ is min heap whereas in C++ is max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(4);
        pq.offer(3);
        pq.offer(2);
        pq.offer(1);
        System.out.println(pq); //print from minimum to maximum
        System.out.println(pq.poll());
        //PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder()); // for max heap implementation - arranged in descending

    }
}
