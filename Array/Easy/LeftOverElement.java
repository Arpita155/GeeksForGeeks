package GeeksForGeeks.Arrays.Easy;

import java.util.Arrays;

//Q. Given an array arr[], the size is reduced by 1 element at each step. In the first step, the maximum element would be removed,
// while in the second step, the minimum element of the remaining array would be removed, in the third step again the maximum,
// and so on. Continue this till the array contains only one element. And find the final element remaining in the array.

public class LeftOverElement {

    public static int leftElement(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length-1;
        int k =0;
        while(k<n){
            n--;
            k++;
        }

        return arr[n];
    }

    public static void main(String[] args) {

        int []arr = {7, 8, 3, 4, 2, 9, 5};
        System.out.println(leftElement(arr));   // 5
    }
}
