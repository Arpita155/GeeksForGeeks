package GeeksForGeeks.Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromUnsortedArray {

    //Q. Given an array arr of integers which may or may not contain duplicate elements. Your task is to remove duplicate elements.

    static ArrayList<Integer> removeDuplicate(int []arr) {
        // code here
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int i:arr){
            set.add(i);
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int []arr = {1, 2, 3, 1, 4, 2};
        System.out.println(removeDuplicate(arr));
    }
}
