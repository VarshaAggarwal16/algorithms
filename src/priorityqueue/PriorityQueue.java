package priorityqueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Node implements Comparator {
    int priority;
    int data;
    Node(int data,int priority){
        this.data = data;
        this.priority = priority;
    }
    @Override
    public String toString() {
        return "Data : " + data +
                " Priority:" + priority;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return ((Node)o1).data - ((Node)o2).data;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Node)) return false;
        return (this.data == ((Node)obj).data) && (this.priority == ((Node)obj).priority);

    }
}

/***
 * Implementation of PriorityQueue with List
 */
public class PriorityQueue {

    List<Node> queue = new ArrayList();

    public Node peek() {
        return queue.get(0);
    }

    public Node poll() {
        Node node = queue.get(0);
        queue.remove(0);
        return node;

    }

    public void add(Node node) {
        if(queue.isEmpty()) {
            queue.add(node);
            return;
        }
        int insertIndex = -1;
        for(int i =0; i < queue.size(); i++){
            if(queue.get(i).priority >= node.priority) {
                continue;
            }
            insertIndex = i;
            break;
        }
        if(queue.size()==insertIndex || insertIndex == -1) {
            queue.add(node);
        }else {
            queue.add(insertIndex, node);
        }
    }

    public void delete(Node node) {
        queue.remove(node);
    }

    public void print() {
        queue.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        p.add(new Node(1, 2));
        p.add(new Node(2, 5));
        p.add(new Node(3, 1));
        p.add(new Node(4, 6));
        p.print();
        System.out.println("---------");
        p.delete(new Node(2,5));
        p.print();
    }
}
