package GeeksForGeeks.Arrays.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class GreaterOnRightSide {

    static ArrayList<Integer> nextGreatest(int []arr) {
        // code here

        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length - 1;
        int j = 0;
        int max = arr[n];
        res.add(-1);

        for(int i = n; i > 0; i--)
            res.add(Math.max(arr[i], res.get(j++)));

        Collections.reverse(res);

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(nextGreatest(arr));   // [17, 5, 5, 5, 2, -1]
    }
}
