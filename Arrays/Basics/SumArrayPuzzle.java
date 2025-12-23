package GeeksForGeeks.Arrays.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an array arr[] of integers, change the given array such that at any index i it contains the sum of all elements except itself.
// Simple way arr[i] should be arr[0] + arr[1] ... arr[i-1] + arr[i+1] ... arr[n-1].

public class SumArrayPuzzle {

    public static List<Integer> sumArray(List<Integer> arr) {
        // Your Code goes here

        int[] nums = new int[arr.size()];
        int total =0;

        for(int num1:arr){
            total += num1;
        }
        for(int i=0;i<arr.size();i++){
            arr.set(i,total-arr.get(i));
        }
        return arr;
    }


    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(3,6,4,8,9));
        System.out.println(sumArray(al));     // Output : [27, 24, 26, 22, 21]

    }
}
