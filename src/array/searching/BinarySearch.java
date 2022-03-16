package array.searching;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int find) {
        if(null == arr || arr.length == 0) return -1;
        Arrays.sort(arr);
        return binarySearch0(arr, 0, arr.length-1, find);
    }

    public static int binarySearch0(int arr[], int low, int high, int find) {
        if(low > high) {
            return -1;
        }
        else{
            int mid = low + ( high - low )/2;
            if(arr[mid]==find) return mid;
            return (arr[mid]<find) ? binarySearch0(arr, mid+1, high, find) : binarySearch0(arr, low, mid-1, find);
        }
    }

    public static void main(String[] args) {
        System.out.println(BinarySearch.binarySearch(new int[]{1,2,3,4,5}, 5));
    }
}
