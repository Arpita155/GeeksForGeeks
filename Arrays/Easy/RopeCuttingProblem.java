package GeeksForGeeks.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class RopeCuttingProblem {

    public static ArrayList<Integer> ropeCutting(int arr[]) {
        // Complete the Function
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();


        for( int i = 0; i< n-1 ;i++){

            if( arr[i] != arr[i+1]){
                res.add(n-1 - i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[]arr = {5, 1, 1, 2, 3, 5};
        System.out.println(ropeCutting(arr));

    }
}
