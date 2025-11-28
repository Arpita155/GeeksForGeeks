package GeeksForGeeks.Arrays.Medium;

import java.util.Arrays;

//Q. Given an array arr[] of size n where every element is in the range from 0 to n-1.
// Rearrange the given array so that the transformed array arrT[i] becomes arr[arr[i]].
//NOTE: arr and arrT are both same variables, representing the array before and after transformation respectively.
public class ReArrangeTheArray2 {

    public static void arrange(long[] arr) {
        long n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + (arr[(int)arr[i]] % n) * n;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        long[] arr = {4,0,2,1,3};
        arrange(arr);   // Output : [3, 4, 2, 0, 1]
    }
}
