package GeeksForGeeks.Arrays.Easy;

import java.util.Arrays;

//Q. Given an array arr. Determine if all the unique elements are contiguous integers.
public class ArrayContainsContiguousIntegers {

    public static boolean areElementsContiguous(int arr[]) {
        // Complete the function
        int n = arr.length;
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            int nextNum=arr[i]+1;
            if(arr[i+1]==arr[i] || arr[i+1]==nextNum)
                count++;
        }
        if(count+1==n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        int []arr = {5, 2, 3, 6, 4, 4, 6, 6};

        System.out.println(areElementsContiguous(arr));   // Output : true  , Explanation: The elements of array form
        // a contiguous set of integers// which is [2, 3, 4, 5, 6] so the output is "Yes".
    }
}
