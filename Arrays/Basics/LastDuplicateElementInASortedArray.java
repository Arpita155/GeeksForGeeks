package GeeksForGeeks.Arrays.Basics;

import java.lang.reflect.Array;
import java.util.Arrays;

//Q. You are given a sorted array arr[] that may contain duplicate elements.  Your task is to find the index of the last
// occurrence of any duplicate element and return the index along with the value of that element.
// If no duplicate element is found, return [-1, -1].

public class LastDuplicateElementInASortedArray {

    public static int[] dupLastIndex(int[] arr) {
        // Complete the function
        int f = -1;
        int l = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                f = i;
                l = arr[i];
            }
        }

        return new int[]{f,l};
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 5, 6, 6, 7};
        System.out.println(Arrays.toString(dupLastIndex(arr)));     //output :  [4, 6]
    }
}
