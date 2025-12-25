package GeeksForGeeks.Arrays.Medium;

import java.util.Arrays;
import java.util.HashSet;

// Q. You are given an integer array arr of size n+2. All elements of the array are in the range from 1 to n.
// Also, all elements occur once except two numbers which occur twice. Find the two repeating numbers.

public class TwoRepeatedElement {

    public static int[] twoRepeated(int[] arr) {
        // code here
        int []ans = new int[2];
        int j = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i])){
                ans[j++]=arr[i];
            }else{
                hs.add(arr[i]);
            }
        }

        return ans;
    }
    public static void main(String[] args) {

        int n = 4;
        int []arr = {1, 2, 1, 3, 4, 3};
        System.out.println(Arrays.toString(twoRepeated(arr)));
    }
}
