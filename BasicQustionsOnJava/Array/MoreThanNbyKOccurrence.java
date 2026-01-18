package GeeksForGeeks.BasicQustionsOnJava.Array;

import java.util.HashMap;
import java.util.Map;

public class MoreThanNbyKOccurrence {

    public static int countOccurrence(int[] arr, int k) {
        // your code here,return the answer
        int n = arr.length;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : arr) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        int d = n/k;
        int count = 0;
        for (int i : m.keySet()) {
            if (m.get(i) > d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[]arr = {3, 1, 2, 2, 1, 2, 3, 3};
        int k = 4;
        System.out.println(countOccurrence(arr,k));
    }
}
