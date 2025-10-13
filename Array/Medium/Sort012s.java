package GeeksForGeeks.Arrays.Medium;

import java.util.Arrays;

// Q. Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
//Note: You need to solve this problem without utilizing the built-in sort function.
public class Sort012s {

    public static int[] sort012(int[] arr) {
        // code here
        int i=0;
        int j=0;
        //0 sort
        while( j<arr.length)     ////shifting 0's at left
        {
            if(arr[j]==0 )
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
        j=i;
        while( j<arr.length)        /// shifting 1's at left
        {
            if(arr[j]==1 )
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int []arr = {0, 1, 2, 0, 1, 2};
        System.out.println(Arrays.toString(sort012(arr)));   // Output : [0, 0, 1, 1, 2, 2]
    }
}
