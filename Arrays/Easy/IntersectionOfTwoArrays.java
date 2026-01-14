package GeeksForGeeks.Arrays.Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        HashSet<Integer> hsa = new HashSet<>();
        for(int i=0;i<a.length;i++){
            hsa.add(a[i]);
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<b.length;i++){
            if(hsa.contains(b[i])){
                hs.add(b[i]);
            }
        }
        ArrayList<Integer> al = new ArrayList<>(hs);

        return al;
    }

    public static void main(String[] args) {
        int[]a = {1, 2, 1, 3, 1};
        int[]b = {3, 1, 3, 4, 1};
        System.out.println(intersect(a,b));
    }
}
