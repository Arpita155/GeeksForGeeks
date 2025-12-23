package GeeksForGeeks.Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;
//Q. Given three sorted arrays a[], b[] and c[] of positive integers. The task is to merge them into a single array which must be sorted in increasing order.
public class MergeThreeSortedArray {

    public static ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            al.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            al.add(b[i]);
        }
        for(int i=0;i<c.length;i++){
            al.add(c[i]);
        }

        Collections.sort(al);

        return al;
    }

    public static void main(String[] args) {

        int[]a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 5};
        int[] c = {1, 2, 3, 4, 5, 6};
        System.out.println(mergeThree(a,b,c));  // Output: [1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6]
    }
}
