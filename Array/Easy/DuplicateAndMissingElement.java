package GeeksForGeeks.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateAndMissingElement {

// Q. Given an unsorted array arr[] of size n, containing elements from the range 1 to n, it is known that one number in this range is missing,
// and another number occurs twice in the array, find both the duplicate number and the missing number.

    public static ArrayList<Integer> findTwoElement(int []arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(arr);
        int dp = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                al.add(arr[i]);
                dp = arr[i];
            }
        }
        int sum = 0;
        int n = arr.length;
        int asum = n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        sum = sum-dp;
        int missingElement = asum - sum;
        al.add(missingElement);
        return al;
    }

    public static void main(String[] args) {
        int []a = {2,2};
        System.out.println(findTwoElement(a));  // Output : [2,1]  Explanation : 2 is duplicate element and 1 is missing element.
    }
}
