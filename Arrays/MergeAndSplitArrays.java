package GeeksForGeeks.Arrays;

import java.util.Arrays;

public class MergeAndSplitArrays {
    public static void mergeArrays(int []a, int []b) {

        // Q. Given two sorted arrays a[] and b[] of size n and m respectively, the task is to merge them in sorted order without using any extra space.
        // Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.

        int n = a.length+b.length;
        int []arr = new int [n];
        int index = 0;
        for(int i=0;i<a.length;i++){
            arr[index++]=a[i];
        }
        for(int i=0;i<b.length;i++){
            arr[index++]=b[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<a.length;i++){
            a[i]=arr[i];
        }
        int x = a.length;
        for(int i=0;i<b.length;i++){
            b[i]=arr[x++];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    public static void main(String[] args) {
        int []a = {2, 4, 7, 10};
        int []b = {2, 3};
        mergeArrays(a,b);   // Output:  a = [2, 2, 3, 4], b = [7,10]
    }
}
