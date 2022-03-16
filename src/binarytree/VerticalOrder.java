package binarytree;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
This program is not working
 */
class Node {

        Node left, right;
        int key;

        Node(Node left, Node right, int key) {
            this.left = left;
            this.right = right;
            this.key = key;
        }
}

public class VerticalOrder {


    public static void printInVerticalOrderFromLeftToRight(Node a) {
        Map<Integer, List<Node>> map = new TreeMap();
        map.put(0, List.of(a));
        assignColumnToChilds(a,0, map);
        for (Map.Entry<Integer, List<Node>> entry : map.entrySet())
        {
            entry.getValue().stream().forEach(n -> System.out.print(n.key));
            System.out.println();
        }
    }

    public static void assignColumnToChilds(Node a, int col, Map map) {
        if(a.left==null) return;
        if(a.right==null) return;

        map.put(col-1, (map.get(col-1) == null) ? List.of(a.left) : List.of(map.get(col-1), a.left));
        map.put(col+1, (map.get(col+1) == null) ? List.of(a.right) : List.of(map.get(col+1), a.right));
        assignColumnToChilds(a.left, col-1, map);
        assignColumnToChilds(a.right, col+1, map);
    }

    public static void main(String[] args) {

        Node e = new Node(null, null, 3);

        Node d = new Node(null , null, 5);
        Node c = new Node(null , null, 4);
        Node b = new Node(c, d, 2);
        Node a = new Node(b , e, 1);
        printInVerticalOrderFromLeftToRight(a);

    }
}
