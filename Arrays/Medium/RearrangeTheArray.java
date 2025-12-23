package GeeksForGeeks.Arrays.Medium;

import java.util.Arrays;

public class RearrangeTheArray {

    // Q. You are given an array of size N. Rearrange the given array in-place such that all the negative numbers occur before all non-negative numbers.
    //(Maintain the order of all -ve and non-negative numbers as given in the original array).

    public static int[] rearrange(int []a, int n) {
        // Your code goes here
        int []temp = new int[n];
        int f=0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                temp[f++]=a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]>=0){
                temp[f++]=a[i];
            }
        }
        for(int i=0;i<n;i++){
            a[i]=temp[i];
        }
        return a;
    }

    public static void main(String[] args) {
        int N = 4;
        int []arr = {-3, 3, -2, 2};
        System.out.println(Arrays.toString(rearrange(arr,N)));   // Output : [-3, -2, 3, 2]
    }
}
