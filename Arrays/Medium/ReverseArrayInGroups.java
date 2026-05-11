package GeeksForGeeks.Arrays.Medium;

import java.util.Arrays;

public class ReverseArrayInGroups {

    public static void reverseInGroups(int[] arr, int k) {

        // code here
        int n = arr.length;
        if(k >= n){
            for(int i=0;i<n/2;i++){
                int temp=arr[i];
                arr[i]=arr[n-i-1];
                arr[n-i-1]=temp;
            }
            return;
        }

        int p = 0;
        while(p<arr.length){
            int l=p;
            int r = Math.min(arr.length-1,p+k-1);
            while(l<=r){
                int temp = arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
            p +=k;
            n -= k;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4, 5};
        int k = 3;
        reverseInGroups(arr,k);
    }
}
