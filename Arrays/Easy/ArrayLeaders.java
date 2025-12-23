package GeeksForGeeks.Arrays.Easy;

import java.util.ArrayList;
import java.util.Collections;

// Q. You are given an array arr of positive integers. Your task is to find all the leaders in the array.
// An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.

public class ArrayLeaders {

    public static ArrayList<Integer> leaders(int []arr) {

        // -----------Brute Force Approach-----------T.C = O(n^2)  S.C =
        /*ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            boolean flag = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                al.add(arr[i]);
            }
        }

        al.add(arr[arr.length-1]);

        return al;
        */

        //-------------Efficient Approach--------- T.C = O(n) , S.C =
        ArrayList<Integer> al = new ArrayList<>();
        int k = 0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=k) {
                al.add(arr[i]);
                k=arr[i];
            }
        }
        Collections.reverse(al);
        return al;
    }

    public static void main(String[] args) {
        int []arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr));   // [17, 5, 2]
    }
}
