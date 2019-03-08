package com.company;

import java.util.ArrayList;
import java.util.List;

class Node{
    int val ;
    Node left;
    Node right;

    Node(int x){// constructor
        val=x;
    }
}
public class LeafSimilar {
    public boolean leafSimilar(Node root1, Node root2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        dfs(root1,list1);
        dfs(root2,list2);
        return list1.equals(list2);

    }

    void dfs(Node node,List<Integer> list){
        if(node!= null){
            if(node.left == null && node.right == null){
                list.add(node.val);
            }

            dfs(node.left ,list);
            dfs(node.right,list);

        }

    }


    public static void main(String args[]) {
    }
}




