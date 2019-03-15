package com.company;

import java.util.HashSet;
public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode current =headA;
        HashSet setA = new HashSet();
        while(current != null ){
            setA.add(current);
            current = current.next;
        }
        ListNode current_b = headB;
        while(current_b !=null){
            if(setA.contains(current_b))
                return current_b;
            current_b = current_b.next;
        }
        return null;
    }


}
