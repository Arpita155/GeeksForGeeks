package GeeksForGeeks.Arrays.Hard;

import java.util.ArrayList;

public class SearchForSubArray {

    public static ArrayList<Integer> search(int[] a, int[] b) {
        // code here

        // ---Naive Approach---
        ArrayList<Integer> al = new ArrayList<>();    // it stores the first index of the subArray
        for(int i=0;i<a.length;i++){
            int j = 0;
            int k = i;
            boolean flag = true;
            while(j < b.length && k < a.length){
                if(a[k]!=b[j]){
                    flag = false;
                    break;
                }
                k++;
                j++;
            }
            if(flag && j==b.length){
                al.add(i);
            }
        }

        return al;
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 1, 0, 4, 1, 1};
        int b[] = {4, 1};
        System.out.println(search(a,b));
    }
}
