package GeeksForGeeks.Arrays.Medium;

import java.util.ArrayList;

// Q.   Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements)
// whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray.
// You need to find the first subarray whose sum is equal to the target.
//
//Note: If no such array is possible then, return [-1].

public class IndexesOfSubArraySum {

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> output = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];

                if(sum==target){
                    output.add(i+1);
                    output.add(j+1);
                    return output;
                }

                if(sum > target){
                    break;
                }
            }
        }

        output.add(-1);
        return output;
    }

    public static void main(String[] args) {
        int []arr = {1, 2, 3, 7, 5};
        int target = 12;
        System.out.println(subarraySum(arr,target));   // Output [2,4]
    }
}
