package GeeksForGeeks.Arrays.Easy;

import java.util.Arrays;

public class CountPairsWhoseSumIsLessThanTarget {

    public static int countPairs(int []arr, int target) {
        // Your code here
        Arrays.sort(arr);
        int n = arr.length;

        int count = 0;
        int l = 0, r = n-1;

        while(l<r){
            int currSum = arr[l]+arr[r];
            if(currSum<target){
                count += r-l;
                l++;
            }
            else r--;
        }
        return count;
    }

    public static void main(String[] args) {
        int[]arr = {7, 2, 5, 3};
        int target = 8;
        System.out.println("Number of total pairs = "+countPairs(arr,target));  // 2 because (2,5) , (2,3)
    }
}
