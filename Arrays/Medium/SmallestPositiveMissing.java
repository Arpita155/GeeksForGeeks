package GeeksForGeeks.Arrays.Medium;

import java.util.HashSet;
//Q. You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.
//
//Note: Positive number starts from 1. The array can have negative integers too.
public class SmallestPositiveMissing {

    public static int missingNumber(int[] nums) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(num >= 0){
                set.add(num);
            }
        }
        int missing = 1;
        while (set.contains(missing)) {
            missing++;
        }
        return missing;
    }

    public static void main(String[] args) {
        int[] arr = {2, -3, 4, 1, 1, 7};
        System.out.println(missingNumber(arr));   // 3
    }
}
