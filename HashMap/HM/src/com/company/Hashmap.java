package com.company;

import java.util.ArrayList;
import java.util.HashMap;

class HashNode{
    String key;
    int value;
    HashNode next;
    public HashNode(String key,int value){
        this.key = key;
        this.value = value;
        next =null;
    }
}

public class Hashmap {
    private ArrayList<HashNode> bucketArray;
    private int size;
    private int bucketSize;

    public Hashmap(){
        bucketArray = new ArrayList<>();
        bucketSize = 5;
        size = 0;
        for(int i=0;i<bucketSize;i++){
            bucketArray.add(null);
        }
    }

    public int size(){
        return size;
    }

    private int getIndex(String key){
        int hcode = key.hashCode();
        return Math.abs(hcode)%bucketSize;
    }

    public void insert(String key,int value){
        HashNode newNode = new HashNode(key,value);
        int index = getIndex(key);

        if(bucketArray.get(index) == null){
            bucketArray.add(index,newNode);
        }else {
            HashNode head = bucketArray.get(index);
            HashNode head2 = bucketArray.get(index);
            while (head2 != null){
                if(head2.key == key){
                    head2.value = value;
                    return;
                }
                head2 = head2.next;
            }
            newNode.next = head;
            bucketArray.add(index,newNode);
        }
        size++;
    }


}
