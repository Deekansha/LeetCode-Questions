package com.company;

class ListNode{
    int val ;
    ListNode next;
    ListNode(){
    }
}
public class middle {
    ListNode head;


    void printMiddle (){
        ListNode slow = head;
        ListNode fast = head;

        while(slow !=null && fast!=null && fast.next !=null){
            slow = slow.next;
            fast= fast.next.next;
        }

        System.out.println("The middle node is "+ slow.val);
    }


    public void insertData(int data){
        ListNode newNode = new ListNode();
        newNode.val = data;
        newNode.next = head;
        head = newNode;

}
    public static void main(String[] args) {

        middle llist = new middle();
        llist.insertData(2);
        llist.insertData(3);
        llist.insertData(8);
        llist.insertData(10);
        llist.insertData(11);
        llist.printMiddle();
}
}


