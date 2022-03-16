package array.searching;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Search {

    public static boolean find(int[] arr, int find) {
        for(int ele : arr){
            if(ele == find) return true;
        }
        return false;
    }

    public static boolean find0(int[] arr, int find) {
        return IntStream.range(0, arr.length)
                .filter(i->arr[i]==find)
                .mapToObj(x->Boolean.TRUE).findFirst().orElse(Boolean.FALSE);

    }

    public static boolean find1(int[] arr, int find) {
        if(null == arr || arr.length == 0) return false;
        for(int i = 0; i < arr.length ; i++) {
            if(arr[i]==find){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{1,2,3,4,5,6,7}, 0));
        System.out.println(find0(new int[]{1,2,3,4,5,6,7}, 0));
        System.out.println(find1(new int[]{1,2,3,4,5,6,7}, 0));
    }
}
