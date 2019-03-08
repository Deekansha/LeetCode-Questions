package com.company;


class Tree{
    int val ;
    Tree left;
    Tree right;

    Tree(int x){// constructor
        val=x;
    }
}

public class MinDepthTree {
    Tree root;
    public int minDepth(Tree root) {
        if(root== null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }

        if(root.left == null){
            return minDepth(root.right)+1;

        }
        if(root.right == null) {
            return minDepth(root.left) + 1;
        }

        return Math.min(minDepth(root.right),minDepth(root.left))+1;

    }



    public static void main(String args[]){
        MinDepthTree tree = new MinDepthTree();
        tree.root = new Tree(1);
        tree.root.left = new Tree(2);
        tree.root.right = new Tree(3);
        tree.root.left.left = new Tree(4);
        tree.root.left.right = new Tree(5);

        System.out.println(" Minimum Depth of the Binary Tree ::" + tree.minDepth(tree.root));
    }

}
