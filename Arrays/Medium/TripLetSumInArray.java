package GeeksForGeeks.Arrays.Medium;

import java.util.Arrays;

public class TripLetSumInArray {

    public static boolean hasTripletSum(int nums[], int target) {
        // code Here

        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<target)j++;
                else if(sum>target)k--;
                else return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int []arr = {1, 4, 45, 6, 10, 8};
        int target = 13;

        System.out.println("Is there Triplet sum possible : "+hasTripletSum(arr,target));    // 1+4+8 = 13
    }
}
