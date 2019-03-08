package com.company;

class TreeNode{
    int val ;
    treenode left;
    treenode right;

    TreeNode(int x){// constructor
        val=x;
    }
}

public class GetLeafCount {
    treenode root;
    int getleafCount(){
        return getleafCount(root);
    }

    int getleafCount(treenode root){
        if (root== null)
            return 0;
        if(root.left == null && root.right== null)
            return 1;
        else
            return getleafCount(root.left) + getleafCount(root.right);
    }
    public static void main(String args[]){

        GetLeafCount tree =new GetLeafCount();
        tree.root = new treenode(1);
        tree.root.left =new treenode(2);
        tree.root.right = new treenode(3);
        tree.root.left.left =new treenode(4);
        tree.root.left.right=new treenode(5);

        System.out.println("Leafcount in binary tree :: "+ tree.getleafCount());

    }
}
