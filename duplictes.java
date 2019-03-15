package com.company;
class LNode {
    int val;
    LNode next;

    LNode() {
    }
}
public class duplictes {
    LNode head;
    LNode current = head;
    LNode next_next ; // a pointer to store the value when we will be deleting the node.
    public LNode deleteDuplicates(LNode head) {
        while(current!= null && current.next != null){
            if(current.next.val == current.next.next.val){
                next_next = current.next.next;
                current.next = null;
                current.next =next_next;

            }
            else{
                current = current.next;
            }
        }

        return head;



    }

    /*

    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
    /*class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;
            while(current != null && current.next != null){
                if(current.val == current.next.val){
                    current.next = current.next.next;
                }
                else{
                    current=current.next;
                }
            }
            return head;

        } */


    public void insertData(int data) {
        LNode newNode = new LNode();
        newNode.val = data;
        newNode.next = head;
        head = newNode;
    }



        public static void main(String[] args) {

        duplictes d = new duplictes();
        d.insertData(1);
        d.insertData(1);
        d.insertData(2);
        System.out.println(d.deleteDuplicates(d.head));

    }
}

