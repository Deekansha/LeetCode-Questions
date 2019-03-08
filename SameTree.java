package com.company;


class TNode
{
    int data;
    TNode left, right;

    TNode(int item)
    {
        data = item;
        left = right = null;
    }
}
public class SameTree {
    TNode root1 , root2;
    public boolean isSameTree(TNode p, TNode q) {
        if(p == null && q == null)
            return true;
        if(p== null || q== null)
            return false;
        if(p.data!= q.data){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public static void main(String args[]){

        SameTree tree =new SameTree();
        tree.root1 = new TNode(1);
        tree.root1.left = new TNode(2);
        tree.root1.right = new TNode(3);
        tree.root1.left.left = new TNode(4);
        tree.root1.left.right = new TNode(5);

        tree.root2 = new TNode(1);
        tree.root2.left = new TNode(2);
        tree.root2.right = new TNode(8);
        tree.root2.left.left = new TNode(4);
        tree.root2.left.right = new TNode(5);

        System.out.println("Same tree result  :: "+ tree.isSameTree(tree.root1,tree.root2));

    }
}


