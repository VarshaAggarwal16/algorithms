package array;

import java.util.Arrays;

public class CommonElements {

    public static int[] commonElements(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int[] answer = new int[(a.length>b.length)?b.length:a.length];
        for(int i=0, j=0,k=0; i < a.length && j < b.length; ) {

            if(a[i]==b[j]) {
                answer[++k] = a[i];
                i++;
                j++;
            }else
            if(a[i]>b[j]) {
                //propel in b
                j++;
            }else
            if(a[i]<b[j]) {
                //propel in a
                i++;
            }
        }
        return Arrays.stream(answer).filter(x->x!=0).toArray();
    }

    public static void main(String[] args) {

        int[] a = new int[]{1,21,3,43,6,7};
        int[] b = new int[]{1,211,3,413,6,17};

        Arrays.stream(commonElements(a, b)).forEach(System.out::println);
    }
}
