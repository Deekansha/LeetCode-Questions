package com.company;

import java.util.LinkedList;

class Node{
    public int val ;
    Node next;


    public void displaydata(){
        System.out.println("{ "+ val+"}");
    }
}

class SinglyLinkedList {
    Node head;
    int count =0;

    public boolean isEmplty(){
        if(head == null)
            return false;
        return true;
    }

    public void insertData(int data){
        Node newNode = new Node();
        newNode.val = data;
        newNode.next = head;
        head = newNode;

    }
    public int getCount(){
        Node temp = head;
        while(temp!= null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public boolean searchElement(Node head , int x){
        Node current = head;
        while(current!= null){
            if(current.val == x)
                return true;
            current = current.next;
        }
        return false;
    }

    public int frequencyOfNumber(Node head , int x){
        Node current = head;
        int cnt =0;
        while(current!= null){
            if(current.val == x)
                cnt++;
            current = current.next;
        }
        return cnt;
    }

    public static void main(String[] args) {

        SinglyLinkedList llist = new SinglyLinkedList();
        llist.insertData(2);
        llist.insertData(3);
        llist.insertData(8);
        llist.insertData(10);

        System.out.println("Size of the linkedlist "+ llist.getCount());
        System.out.println("Frequency "+ llist.frequencyOfNumber(llist.head,8));
        if (llist.searchElement(llist.head, 10)) {
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }







    }


}
