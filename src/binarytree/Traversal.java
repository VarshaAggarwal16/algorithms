package binarytree;

public class Traversal {

    static class Node {

        Node left, right;
        int key;

        Node(Node left, Node right, int key) {
            this.left = left;
            this.right = right;
            this.key = key;
        }
    }

    public static void preorderTraversal(Node node) {
        if(node == null) return;
        System.out.print(node.key + ",");
        if(node.left != null) preorderTraversal(node.left);
        if(node.right != null) preorderTraversal(node.right);
    }

    public static void inorderTraversal(Node node) {
        if(node == null) return;
        if(node.left != null) inorderTraversal(node.left);
        System.out.print(node.key + ",");
        if(node.right != null) inorderTraversal(node.right);
    }

    public static void postorderTraversal(Node node) {
        if(node == null) return;
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.key + ",");
    }
    public static void main(String[] args) {

        Node e = new Node(null, null, 3);

        Node d = new Node(null , null, 5);
        Node c = new Node(null , null, 4);
        Node b = new Node(c, d, 2);
        Node a = new Node(b , e, 1);

        System.out.println("PRE");
        preorderTraversal(a);
        System.out.println("");
        System.out.println("IN");
        inorderTraversal(a);
        System.out.println("");
        System.out.println("POST");
        postorderTraversal(a);


    }
}
