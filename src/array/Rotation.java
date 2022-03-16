package array;

public class Rotation {

    public static boolean isRotation(int[] a, int[] b) {
        if (null == a || a.length == 0 || null == b || b.length == 0 || a.length != b.length) return false;
        int index = -1;
        for(int j=0; j < b.length ; j++) {
            if(a[0]==b[j]){
                index=j;
            }
        }
        if(index == -1) return false;
        for(int j =0; j < b.length; j++) {
            int ind = (index + j) % b.length;
            if(b[ind]!=a[j]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] b = new int[]{4, 5, 6, 7, 2, 1, 3};
        System.out.println(isRotation(a,b));
    }
}
