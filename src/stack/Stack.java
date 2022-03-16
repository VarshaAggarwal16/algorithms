package stack;

import java.util.Arrays;
import java.util.stream.IntStream;

//Stack using array
public class Stack {

    int initialCapacity = 10; //default
    int increaseBy = 10; //default
    Integer[] arr = new Integer[initialCapacity];

    Stack(){

    }

    Stack(int initialCapacity, int increaseBy) {
        this.initialCapacity = initialCapacity;
        this.increaseBy = increaseBy;
    }

    public void push(int data){
        if(arr[arr.length-1]!=null) {
            //time to increase the size of the array, increase by 10
            Integer[] newS = new Integer[arr.length+10];
            newS[arr.length+1]=data;
            System.arraycopy(arr, 0, newS, 0, arr.length+1);
            arr=newS;
        }
        long ind = Arrays.stream(arr).filter(x->x!=null).count();
        arr[(int)ind]=data;
    }

    public Integer pop() {
        if(arr==null) return null;
        if((int)Arrays.stream(arr).filter(x->x==null).count() == arr.length) return null;
        long nonNullCount = IntStream.range(0,arr.length).filter(x->arr[x]!=null).count();
        int temp = arr[(int)nonNullCount-1];
        arr[(int)nonNullCount-1] = null;
        return temp;
    }

    public int peek() {
        return arr[arr.length-1];
    }

    public void print() {
        final long count = IntStream.range(0, arr.length)
                .filter(x -> arr[x] != null)
                .count();
        IntStream.range(0, (int)count).forEach(x->System.out.println(arr[((int)count)-x-1]));
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.pop();s.pop();
        s.pop();s.pop();
        s.push(1);
        s.push(3);
        s.push(2);
        s.push(4);
        s.push(5);
        s.print();
        System.out.println("----------------------");
        System.out.println(s.pop());
        s.pop();s.pop();
        s.pop();s.pop();
        s.pop();s.pop();
        System.out.println("----------------------");
        s.print();
    }
}
