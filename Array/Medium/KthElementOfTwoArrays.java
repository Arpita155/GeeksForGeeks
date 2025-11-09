package GeeksForGeeks.Arrays.Medium;

import java.util.Arrays;

public class KthElementOfTwoArrays {

    public static int kthElement(int a[], int b[], int l) {
        // code here


        int i=0;
        int j =0;
        int k = 0;
        int []combined = new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                combined[k++]=a[i];
                i++;
            }else{
                combined[k++]=b[j];
                j++;
            }
        }

        while(i < a.length) {
            combined[k++]=a[i];
            i++;
        }

        while(j < b.length) {
            combined[k++]=b[j];
            j++;
        }

        System.out.println("Sorted array is : "+Arrays.toString(combined));
        return combined[l-1];
    }

    public static void main(String[] args) {

        int[]a = {1,2,2, 3, 6, 7,8, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;
        System.out.println(kthElement(a,b,k));    // 3
    }
}
