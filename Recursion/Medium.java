package GeeksForGeeks.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Medium {

    public static List<List<Integer>> combinationSum2(int[] a, int s) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(a);
        backtrack(list, new ArrayList<Integer>(), a, s, 0);
        return list;

    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] cand, int t, int start) {
        if(t < 0) return;
        else if(t == 0) list.add(new ArrayList<>(tempList));
        else{
            for (int i = start; i < cand.length; i++) {
                if(i > start && cand[i] == cand[i-1]) continue; // skip duplicates
                tempList.add(cand[i]);
                backtrack(list, tempList, cand, t - cand[i], i+1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(combinationSum2(candidates,target));   // [[1, 1, 6], [1, 2, 5], [1, 7], [2, 6]]
    }
}
