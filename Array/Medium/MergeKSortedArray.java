package GeeksForGeeks.Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class MergeKSortedArray {

    public static ArrayList<Integer> mergeArrays(int[][] mat) {
        // Code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                al.add(mat[i][j]);
            }
        }

        Collections.sort(al);

        return al;
    }

    public static void main(String[] args) {

        int [][]mat = {{1, 3, 5, 7},
                {2, 4, 6, 8},
                {0, 9, 10, 11}
        };

        System.out.println(mergeArrays(mat));   // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
    }
}
