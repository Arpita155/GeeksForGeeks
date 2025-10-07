import java.util.*;

public class SumOfDistinctElement {
    //Q. You are given an array arr. Find the sum of distinct elements in an array.

    public static int findSum(int arr[]) {
        
        Arrays.sort(arr);
        int sum = arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                sum += arr[i+1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int []arr = {5,5,5,5,5,5};
        System.out.println(findSum(arr));
    }
}


