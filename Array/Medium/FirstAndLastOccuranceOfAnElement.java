package GeeksForGeeks.Arrays.Medium;

import java.io.FilterOutputStream;
import java.util.ArrayList;

//Q.  Given a sorted array arr with possibly some duplicates, the task is to find the first and last occurrences of an element x in the given array.
//Note: If the number x is not found in the array then return both the indices as -1.

public class FirstAndLastOccuranceOfAnElement {

    public static ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> al = new ArrayList<>(2);
        int n = 0;
        int f = -1;
        int l = -1;
        while(n<arr.length){
            if(arr[n]==x){
                f = n;
                break;
            }
            n++;
        }
        int m = arr.length-1;
        while(m>=0){
            if(arr[m]==x){
                l = m;
                break;
            }
            m--;
        }
        al.add(f);
        al.add(l);
        return al;
    }

    public static void main(String[] args) {
        int []arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;
        System.out.println(find(arr,x));  // [2,5]
    }
}
