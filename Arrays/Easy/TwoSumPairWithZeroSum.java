package GeeksForGeeks.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumPairWithZeroSum {

    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int i=0, j=n-1;
        while(i<j){
            int sum = arr[i]+arr[j];
            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[j]);
                ans.add(pair);
                i++;
                j--;
                while (i < j && arr[i] == arr[i - 1]) i++;
                while (i < j && arr[j] == arr[j + 1]) j--;

            }
            else if(sum<=0){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(getPairs(arr));          // [[-1, 1]]
    }
}
