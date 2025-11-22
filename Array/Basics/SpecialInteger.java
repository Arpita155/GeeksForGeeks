package GeeksForGeeks.Arrays.Basics;

import java.util.HashSet;

public class SpecialInteger {

    public static int specialIntegers(int n, int[] nums) {
        // code here
        HashSet<Integer>set = new HashSet<>();
        for(int arr : nums){
            set.add(arr);
        }
        int count = 0;
        for(int num : set){
            if(set.contains(num-1)&& set.contains(num+1)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int n = 5;
        int[] arr = {1,2,3,3,4};

        System.out.println(specialIntegers(n,arr));   // 2
    }
}
