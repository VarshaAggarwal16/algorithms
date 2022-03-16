package binarytree;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*
In BST, left node is smaller than root, and right node is larger than root
 */

/**
 *          5
 *        3   6
 *       1 4 3 8
 */
public class BinarySearchTree {

    static class Node {
        int data;
        Node left, right;
        Node(Node left, Node right,int data) {
            this.left = left;
            this.right=right;
            this.data = data;
        }
    }

    public static boolean search (Node node, int data) {
        if(node == null) return false;
        if(node.data == data ) return true;
        return (node.data < data) ? search(node.right, data) : search(node.left, data);
    }


    public static void insert(Node node, int data) {
        if(null == node) {
            node = new Node(null, null, data);
        }
        Map<Integer, Integer> m = new HashMap();
        m.entrySet().stream()
                .map(x->x.getValue())
                .max(Comparator.naturalOrder()).get();
    }

    public boolean isBST(Node root) {
        if(root == null) return false;
        //all left nodes are smaller than right nodes
        return isBSTUtil(root, Integer.MAX_VALUE, Integer.MIN_VALUE) ;
    }

    private boolean isBSTUtil(Node node, int rightmin, int leftmax ) {
        if(node == null) return true;
        if(node.left != null && node.left.data < rightmin) return true;
        if(node.right != null && node.right.data > leftmax) return true;
        return isBSTUtil(node.left, rightmin, (leftmax<node.left.data)?node.left.data:leftmax)
                && isBSTUtil(node.right, (rightmin>node.right.data)?node.right.data:rightmin, leftmax)
        ;
    }

    public void print(Node root) {

    }

    public static void main(String[] args) {

    }
}
