package GeeksForGeeks.Arrays.Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class MergeAndSort {

    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        // code here
        ArrayList<Integer> output = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
            if(!set.contains(arr1[i])){
                set.add(arr1[i]);
                output.add(arr1[i]);
            }
        }
        for(int i = 0;i<arr2.length;i++){
            if(!set.contains(arr2[i])){
                set.add(arr2[i]);
                output.add(arr2[i]);
            }
        }
        Collections.sort(output);
        return output;
    }

    public static void main(String[] args) {
        
    }
}
