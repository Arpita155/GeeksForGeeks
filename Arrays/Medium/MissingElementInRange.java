package GeeksForGeeks.Arrays.Medium;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingElementInRange {

    public static ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i : arr){
            hs.add(i);
        }
        for(int i=low;i<=high;i++){
            if(!hs.contains(i)){
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[]arr = {10, 12, 11, 15};
        int low = 10;
        int high = 15;
        System.out.println(missingRange(arr,low,high));   // [13, 14]
    }
}
