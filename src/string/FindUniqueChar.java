package string;

import java.util.stream.IntStream;

public class FindUniqueChar {

    /**
     * Assuming all chars are small
     * @param input
     * @return
     */
    public static char findUniqueChar(String input){
        if(null == input || input.length()==0 ) throw new IllegalStateException();
        char[] inchar = input.toCharArray();
        int[] allPossibleChars = new int[26];
        for(int c: inchar){
            int index = c -'a';
            allPossibleChars[index]++;
        }
        int indx = IntStream.range(0, allPossibleChars.length)
                .filter(i->allPossibleChars[i]==1).findFirst().getAsInt();
        return ((char)('a'+indx));
    }

    public static void main(String[] args) {
        System.out.println(findUniqueChar("abcdacd"));
    }
}
