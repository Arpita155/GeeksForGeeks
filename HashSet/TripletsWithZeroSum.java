package GeeksForGeeks.HashSet;

import java.util.HashSet;

public class TripletsWithZeroSum {
    public static boolean findTriplets(int[] arr) {
        // code here.

        // Q. Given an array arr[] of integers, determine whether it contains a triplet whose sum equals zero.
        // Return true if such a triplet exists, otherwise, return false.
        HashSet<Integer> set = new HashSet<>();
        int target = 0;

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(set.contains(target - (arr[i] + arr[j]))) {
                    return true;
                }
            }
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int []arr = {0, -1, 2, -3, 1};
        System.out.println(findTriplets(arr));
    }
}
