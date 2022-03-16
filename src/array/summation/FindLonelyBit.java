package array.summation;

public class FindLonelyBit {

    public static int lonelyBit(int[] arr) {
        int result=0;
        for(int a : arr){
            result ^= a;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,1,2,3,3,7,2,5,5,4,4};
        int result = 0;
        for(int a : arr) {
            result ^= a;
        }
        System.out.println(result);
    }
}
