package array.summation;

import java.util.stream.IntStream;

public class summation {

    public static int summation(int[] arr) {
        return IntStream.of(arr).sum();
    }

    public static int summation0(int[] arr) {
        int sum = 0;
        for(int x : arr) {
            sum += x;
        }
        return sum;
    }

    public static int summation2(int[] arr) {
        return IntStream.range(0, arr.length)
                .map(i->arr[i])
                .reduce((a,b)->a+b).getAsInt();
    }

    public static int summation3(int[] arr) {
        if (null == arr || arr.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = summation(new int[]{1,2,3});
        System.out.println(sum);
        sum = summation0(new int[]{1,2,3});
        System.out.println(sum);
        sum = summation2(new int[]{1,2,3});
        System.out.println(sum);
        sum = summation3(new int[]{1,2,3});
        System.out.println(sum);
    }
}
