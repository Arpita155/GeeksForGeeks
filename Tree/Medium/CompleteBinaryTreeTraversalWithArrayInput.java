package GeeksForGeeks.Tree.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class CompleteBinaryTreeTraversalWithArrayInput {

    public static ArrayList<ArrayList<Integer>> levelSort(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        int n = arr.length;
        int index = 0;
        int levelSize = 1;

        while (index < n) {
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < levelSize && index < n; i++) {
                level.add(arr[index++]);
            }

            Collections.sort(level);
            res.add(level);
            levelSize *= 2;
        }



        return res;
    }

    public static void main(String[] args) {
        int[]arr = {7, 6, 5, 4, 3, 2, 1};
        System.out.println(levelSort(arr));
    }
}
