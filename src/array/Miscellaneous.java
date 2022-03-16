package array;

import java.util.Arrays;

public class Miscellaneous {

    public static void main(String[] args) {

        int[] arr = new int[]{1,3,5,8,4,5,7,4};

        //print the array
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        //find the max in the array
        System.out.println("Max in the array " + Arrays.stream(arr).max().getAsInt());
        //find the min in the array
        System.out.println("Min in the array " + Arrays.stream(arr).min().getAsInt());
        //find the sum of the array
        System.out.println("Sum of the array " + Arrays.stream(arr).sum());
        //count the elements of the array
        System.out.println("count of the array " + Arrays.stream(arr).count());
        //count the elements of the array
        System.out.println("count of the array " + Arrays.stream(arr).summaryStatistics().getCount());
        //find the average in the array
        System.out.println("Average in the array " +
                Arrays.stream(arr).summaryStatistics().getAverage());
    }
}
