package GeeksForGeeks.Matrix.Easy;

import java.util.ArrayList;

public class MeanOfRangeInArray {

    public static ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        // code here

        // ---------Naive Approach ------
        /*ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            int sum = 0;
            int length = 0;
            for(int j=queries[i][0];j<=queries[i][1];j++){
                sum += arr[j];
                length++;
            }
            int mean = (int)sum/length;
            al.add(mean);
        }

        return al;*/

        // -------------Efficient Approach-----------
        ArrayList<Integer> res = new ArrayList<>();
        int sum[] = new int[arr.length];
        sum[0] = arr[0];

        for (int i=1; i<arr.length; i++){
            sum[i] = sum[i-1] + arr[i];
        }

        for (int i=0; i<queries.length; i++){

            int l = queries[i][0];  //left
            int r = queries[i][1];  //right

            int total = sum[r] - (l>0 ? sum[l-1] : 0);
            int count = (r+1)-l;
            res.add(total / count);
        }
        return res;
    }

    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4, 5};
        int[][]queries = {{0, 2}, {1, 3}, {0, 4}};

        System.out.println(findMean(arr,queries));
    }
}
