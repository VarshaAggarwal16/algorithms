package string.reverse;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringReverse {

    public static String reverse(String input) {
        if(null == input || input.length() == 0) return null;
        char[] charArray = input.toCharArray();
        int lenght = input.length();
        StringBuilder sb = new StringBuilder();
        IntStream.rangeClosed(0, lenght-1)
                .mapToObj(i -> String.valueOf(charArray[lenght-1-i]))
                .forEach(x-> sb.append(x));
        return sb.toString();
    }

    public static String reverse0(String input) {
        if(null == input || input.length() == 0) return null;
        String[] arr = input.split("");
        String answer = "";
        for(String s : arr){
            answer = s + answer;
        }
        return answer;
    }

    public static String reverse1(String input) {
        if(null == input || input.length() == 0) return null;
        String[] inputArr = input.split("");
        for(int low = 0, high = inputArr.length-1 ; low < inputArr.length/2; low++, high--) {
            String temp = inputArr[high];
            inputArr[high] = inputArr[low];
            inputArr[low]= temp;
        }
        return Arrays.stream(inputArr).collect(Collectors.joining());
    }

    public static void reverse2(String input, int i) {
        if(i==input.length()) return;
        String c = input.substring(i,i+1);
        reverse2(input, i+1);
        System.out.print(c);
    }

    public static void main(String[] args) {
        System.out.println(reverse1("12"));
        reverse2("varsha",0);
    }
}
