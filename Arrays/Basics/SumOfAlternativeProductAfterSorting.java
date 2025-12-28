package GeeksForGeeks.Arrays.Basics;

import java.util.Arrays;

public class SumOfAlternativeProductAfterSorting {

    public static int altProduct(int[] arr) {
        // Your code goes here
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        int sum = 0;
        while(left < right){
            sum += arr[left]*arr[right];
            left++;
            right--;
        }

        return sum;
    }

    public static void main(String[] args) {
        int []arr = {9, 2, 8, 4, 5, 7, 6, 0};
        System.out.println("Sum = "+altProduct(arr));  // sum = 74
    }
}
