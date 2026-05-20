package GeeksForGeeks.Arrays.Basics;

import java.util.HashMap;
import java.util.Map;

public class SmallerNumbersRepeatingKTimes {

    public static int findDuplicate(int[] nums, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(k)) {
                min = Math.min(min, entry.getKey());
            }
        }
        return (min == Integer.MAX_VALUE) ? -1 : min;

    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 3, 1};
        int k = 2;
        System.out.println("Kth time duplicate value is : "+findDuplicate(arr,k));
    }
}
