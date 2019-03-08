package com.company;

class BTree{
    int val ;
    BTree left;
    BTree right;

    BTree(int x){// constructor
        val=x;
        left=null;
        right=null;
    }
}

public class BalancedTree {
    BTree root;
    public boolean isBalanced(BTree root) {

        if(root == null){
            return true;
        }
        int llength = maxHeight(root.left);
        int rlength = maxHeight(root.right);

        if (Math.abs(llength -rlength) > 1){
            return false;
        }
        return isBalanced(root.right) && isBalanced(root.left);
    }

    int maxHeight(BTree root){
        if(root == null){
            return 0;
        }
        int left_depth = maxHeight(root.left);
        int right_depth = maxHeight(root.right);
        int max_depth = Math.max(left_depth, right_depth) + 1;
        return max_depth;
    }

    public static void main(String args[]){
        BalancedTree tree = new BalancedTree();
        tree.root = new BTree(1);
        tree.root.left = new BTree(2);
        tree.root.right = new BTree(3);
        tree.root.left.left = new BTree(4);
        tree.root.left.right = new BTree(5);

        System.out.println(" The tree is balanced :: " + tree.isBalanced(tree.root));
    }
    }
