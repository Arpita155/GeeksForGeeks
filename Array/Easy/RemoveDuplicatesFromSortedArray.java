package GeeksForGeeks.Arrays.Easy;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {

    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here

        ArrayList<Integer> output = new ArrayList<>();
        output.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                output.add(arr[i]);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int []arr = {2, 2, 2, 2, 2};
        System.out.println(removeDuplicates(arr));   // [2]
    }
}
