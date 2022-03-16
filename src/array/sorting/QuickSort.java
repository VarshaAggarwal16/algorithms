package array.sorting;

/**
 * inComplete
 */
public class QuickSort {

    public static int[] quicksort(int[] arr) {
        quicksort0(arr, 0, arr.length-1);
        return arr;
    }

    public static void quicksort0(int[] arr, int left, int right) {

        if(left >= right) return;
        int pivot = (left +  right) /2;
        int index = partition(arr, left, right, arr[pivot]);
        quicksort0(arr, left, index-1);
        quicksort0(arr, index, right);
    }

    private static int partition(int[] arr, int left, int right, int pivot) {

        while(left < right) {
            while(arr[left]< pivot){
                left++;
            }
            while(arr[right]>pivot) {
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;right--;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        quicksort(new int[]{1,2,5,4,67,12});
    }
}
