package GeeksForGeeks.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class KLargestElementInDecreasingOrder {
    public static ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        ArrayList<Integer> element = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        int index = 0;
        for(int i=n-1;i>=n-k;i--){
            element.add(arr[i]);
        }
        return element;
    }

    public static void main(String[] args) {
        int []arr = {12, 5, 787, 1, 23};
        int k = 2;
        System.out.println(kLargest(arr,k));
    }
}
