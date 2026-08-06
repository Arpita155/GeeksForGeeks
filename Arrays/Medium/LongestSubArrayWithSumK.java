package GeeksForGeeks.Arrays.Medium;

import java.util.HashMap;

public class LongestSubArrayWithSumK {

    public static int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If prefix sum itself is equals to k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Check if (sum - k) exists in the map
            if (hm.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - hm.get(sum - k));
            }

            // Store the first occurrence of the sum
            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[]arr = {10, 5, 2, 7, 1, -10};
        int k = 15;

        System.out.println(longestSubarray(arr,k));
    }
}
