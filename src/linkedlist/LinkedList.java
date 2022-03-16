package linkedlist;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class LinkedList {

    Node head;

    public void addFirst(int a) {
        if(head==null) {
            head = new Node(a);
        }else{
            Node n = new Node(a);
            Node pointer = head;
            head = n;
            n.next = pointer;
        }
    }

    public void print() {
        Node pointer = head;
        while(pointer != null){
            System.out.println(pointer.data);
            pointer = pointer.next;
        }
    }

    public void addLast(int a) {
        if(head==null) head = new Node(a);
        Node lastPointer = head;
        while(lastPointer.next != null) {
            lastPointer = lastPointer.next;
        }
        lastPointer.next = new Node(a);
    }

    public void deleteFirst() {
        if(head==null) return;
        head = head.next;
    }

    public void deleteLast() {
        if(head==null) return;
        Node pointer = head;
        while(pointer.next.next != null){
            pointer = pointer.next;
        }
        pointer.next = null;
    }

    public Node poll() {
        Node ret = head.next;
        head = ret;
        return head;
    }

    public Node peek() {
        return head;
    }

    public static void main(String[] args) {
        LinkedList local = new LinkedList();
        local.addFirst(1);
        local.addFirst(2);
        local.addFirst(3);
        local.addLast(4);
        local.deleteFirst();
        local.deleteLast();
        local.poll();
        System.out.println(local.peek().data);
        local.print();
    }
}
