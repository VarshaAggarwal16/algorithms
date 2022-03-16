package string;

public class PrintAllPermutations {

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    private static void permute(String str, int l, int r) {
        if (l == r) System.out.println(str);
        else for (int i = l; i <= r; i++) {
            permute(swap(str, l, i), l + 1, r);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        permute(s, 0, s.length() - 1);
    }
}
