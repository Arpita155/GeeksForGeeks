package GeeksForGeeks.Arrays.Medium;

import java.util.ArrayList;

public class SubArrayFrequencyCountQueries {

    public static ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            int count = 0;
            int t = queries[i][2];
            int p = queries[i][0];
            int q = queries[i][1];
            while(p<=q){
                if(arr[p] == t){
                    count++;
                }
                p++;
            }
            res.add(count);
        }

        return res;
    }

    public static void main(String[] args) {
        int[]arr = {1, 2, 1, 3, 1, 2, 3};
        int[][]queries = {{0, 4, 1}, {2, 5, 2}, {1, 6, 3}, {0, 6, 5}};
        System.out.println("Number of frequency count = "+freqInRange(arr,queries));
    }
}
