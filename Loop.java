package com.company;

import java.util.HashSet;

class LinkedNode{
    int val ;
    LinkedNode next;
    LinkedNode(){
    }
}
public class Loop {

    LinkedNode head;

    public void insertData(int data) {
        LinkedNode newNode = new LinkedNode();
        newNode.val = data;
        newNode.next = head;
        head = newNode;
    }

    boolean detectloop(LinkedNode h){
        HashSet<Integer> hash = new HashSet();
        while(h!= null){

            if (hash.contains(h))
                return true;

            hash.add(h.val);
            h=h.next;
        }

        return false;

    }

    public static void main(String[] args) {
	  Loop llist = new Loop();
        llist.insertData(2);
        llist.insertData(3);
        llist.insertData(8);
        llist.insertData(10);
        llist.insertData(11);
        System.out.println(llist.detectloop(llist.head));
    }
}
