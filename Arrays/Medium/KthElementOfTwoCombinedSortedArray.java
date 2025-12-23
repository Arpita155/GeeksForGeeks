package GeeksForGeeks.Arrays.Medium;

import java.util.Arrays;

// Q. Given two sorted arrays a[] and b[] and an element k,
// the task is to find the element that would be at the kth position of the combined sorted array.
public class KthElementOfTwoCombinedSortedArray {

    public static int kthElement(int []a, int []b, int k){

         int []combined = new int[a.length+b.length];
         int n = a.length;
         for(int i=0;i<n;i++){
             combined[i]=a[i];
         }
         int l=0;
         for(int i=n;i<combined.length;i++){
             combined[i]=b[l++];
         }
         Arrays.sort(combined);
         int result = 0;
         for(int i=1;i<combined.length;i++){
             if(i==k){
                 result = combined[i-1];
                 break;
             }
         }
         return result;
    }

    public static void main(String[] args) {
        int []a = {2, 3, 6, 7, 9};
        int []b = {1, 4, 8, 10};
        int k = 5;
        System.out.println(kthElement(a,b,k));   // Output : 6
    }
}
