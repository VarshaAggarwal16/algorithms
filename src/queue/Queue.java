package queue;

import java.util.Arrays;

/**
 * Queue using arrays
 */
class CustomObject {
    int data;
    CustomObject(int data){
        this.data = data;
    }
}
//FIFO
public class Queue {

    CustomObject[] queue;

    public void add(CustomObject a) {
        if(queue==null){
            queue=new CustomObject[1];
            queue[0]=a;
        }
        int len = queue.length;
        if(queue[len-1]!=null) {
            //increase the size by 10 items
            CustomObject[] newQ = new CustomObject[len+10];
            System.arraycopy(queue, 0, newQ, 0, queue.length);
            queue = newQ;

        } else {
            int i = 0;
            while(queue[i] != null) {
                i++;
            }
            queue[i] = a;
        }

    }

    public CustomObject peek() {
        if(queue==null) return null;
        return queue[0];
    }

    public CustomObject poll() {
        if(queue==null) return null;
        //get and remove
        CustomObject toRet = queue[0];
        long nonNulllength = Arrays.stream(queue).filter(x->x!=null).count();
        CustomObject[] newQ = new CustomObject[(int)nonNulllength-1];
        System.arraycopy(queue, 1, newQ, 0, (int)nonNulllength-1);
        queue=newQ;
        return  toRet;
    }

    public void print() {
        Arrays.stream(queue).filter(x->x!=null).map(c->c.data).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(new CustomObject(1));
        q.add(new CustomObject(2));
        q.add(new CustomObject(3));
        q.add(new CustomObject(4));
        q.print();
        System.out.println("--------------------------------------------");
        CustomObject peek = q.peek();
        System.out.println((peek==null)?null:peek.data);
        System.out.println("--------------------------------------------");
        q.poll();
        q.print();
    }
}
