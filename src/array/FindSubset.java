package array;

import java.util.Arrays;

/**
 * This solution does not handle repitition of elements in second array.
 */
public class FindSubset {

    //here sorting is used
    public static boolean whetherSubset(int[] arr1, int[] arr2) {
        if((arr1==null || arr1.length==0)
        || arr2==null || arr2.length==0 ||
        (arr2.length > arr1.length)) return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int ele = arr2[0];
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != ele) continue;
            for(int j = i+1, k=1; j < arr2.length; j++, k++) {
                if(arr2[k]!=arr1[j]) return false;
            }
            return true;
        }
        return false;
    }

    //without sorting
    public static boolean whetherSubset0(int[] arr1, int[] arr2) {
        if((arr1==null || arr1.length==0)
                || arr2==null || arr2.length==0 ||
                (arr2.length > arr1.length)) return false;
        for(int i=0; i<arr2.length;i++){
            boolean found = false;
            for(int j=0; j<arr1.length;j++) {
                if(arr2[i]==arr1[j]){
                    found = true;
                }
            }
            if(!found) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(whetherSubset(
                new int[]{1,2,3,4,5,6,0},
                new int[]{1,2,0}
        ));

        System.out.println(whetherSubset0(
                new int[]{1,2,3,4,5,6,0},
                new int[]{1,2,0,1}
        ));
    }
}
