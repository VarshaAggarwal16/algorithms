package array.summation;

/**
 * Incomplete
 */
public class MatchingPairs {

    public static int[] oneSumPair(int[] input, int sum) {

        for(int i =0 ; i < input.length; i++)
            for(int j =0 ; j < input.length; j++) {
                if(input[i]+input[j]==sum) {
                    return new int[]{input[i], input[j]};
                }
            }
        return null;
    }

    public static int[] oneSumPair0(int[] input, int sum) {
        return null;
    }

    public static int oneSumPair00(int[] input, int remainder, int index, int[] answer) {
        if(remainder == 0 ) return 1;
        if(remainder < 0 ) return 0;
        for(int i =0; i < input.length; i++) {
            if(index==i) continue;
            int ans = oneSumPair00(input, remainder - input[i], i, answer);
            if(ans == 1) {

            }
        }
        return 1;
    }

    public static void main(String[] args) {

        oneSumPair(new int[]{1,2,4,4}, 8);
        System.out.println("");
    }
}
