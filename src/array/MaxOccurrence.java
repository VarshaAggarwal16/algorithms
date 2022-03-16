package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;
public class MaxOccurrence {

    // Implement your solution below.
    public static Integer mostFreqent(int[] givenArray) {
        Integer maxItem = null;
        Map<Integer, Integer> map = new HashMap();
        for(int ele : givenArray) {
            map.put(ele, (map.get(ele)==null) ? 1: map.get(ele)+1);
        }
        int max = Integer.MIN_VALUE;
        Map.Entry<Integer, Integer> answer = null;
        for(Map.Entry<Integer, Integer> me : map.entrySet()) {
            if(me.getValue()>max){
                max = me.getValue();
                answer=me;
            }
        }
        return answer.getKey();
    }

    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};

        System.out.println(mostFreqent(array1));
    }

}

