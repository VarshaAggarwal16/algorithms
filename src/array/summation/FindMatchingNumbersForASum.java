package array.summation;

import java.util.ArrayList;
import java.util.List;

public class FindMatchingNumbersForASum {

    public static int find(List numbers, int sum) {
        List<List<Integer>> answer = new ArrayList<>();
        find0(numbers, sum, answer);
        return 1;
    }

    public static int find0(List<Integer> numbers, int remainder, List<List<Integer>> answer) {

        if(remainder == 0) return 1;
        if(remainder < 0 ) return 0;
        for(int i=0; i < numbers.size(); i++) {

            if(numbers.get(i)>remainder){
                continue;
            }

            List<Integer> unused = new ArrayList(numbers);
            unused.remove(numbers.get(i));

            if(1==find0(unused, remainder - numbers.get(i), answer)){
                if(remainder-numbers.get(i)==0){
                    List n = new ArrayList();
                    n.add(numbers.get(i));
                    answer.add(n);
                }else{
                    for(List l : answer) {
                        l.add(numbers.get(i));
                    }
                }
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        find(List.of(1,2,4,4), 8);
    }
}
