package GeeksForGeeks.Arrays.Basics;

import java.util.HashSet;
import java.util.Set;

public class SumOfCommonElements {

    public static int commonSum(int []arr1, int []arr2) {
        // Your code here
        Set<Integer> s1 = new HashSet<>();
        for(int i : arr1) s1.add(i);
        Set<Integer> s2 = new HashSet<>();
        for(int i : arr2) s2.add(i);
        int sum=0;

        int mod = 1000000007;
        for(int i : s1)
        {
            if(s2.contains(i))
            {
                sum = (sum + i) % mod;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5};
        int []arr2 = {2,3,4,5,6};
        System.out.println("Sum of common elements : "+commonSum(arr1,arr2));  // 14
    }
}
