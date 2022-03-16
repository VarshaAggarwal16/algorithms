package numbers;

public class Fibonacci {

    public static void printFibonacci(int firstN) {
        int prevprev = 0;
        int prev = 1;
        System.out.print(prevprev + "," + prev + ",");
        for(int i = 2; i <= firstN; i++) {
            System.out.print((prevprev+prev)+",");
            int temp = prev;
            prev= prevprev+prev;
            prevprev = temp;
        }
    }

    public static int returnFibonacci(int N) {
        if(N<=1) return N;
        return returnFibonacci(N-1) + returnFibonacci(N-2);
    }

    public static void main(String args[]) {
        printFibonacci(10);
        System.out.println(returnFibonacci(10));
    }
}
