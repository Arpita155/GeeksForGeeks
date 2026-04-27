package GeeksForGeeks.HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CommonInThreeSortedArray {

    public static ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        HashSet<Integer> hs3 = new HashSet<>();
        for(int i : a){
            hs1.add(i);
        }
        for(int i : b){
            hs2.add(i);
        }
        for(int i:c){
            if(hs1.contains(i) && hs2.contains(i)){
                hs3.add(i);
            }
        }

        ArrayList<Integer> al = new ArrayList<>(hs3);
        Collections.sort(al);

        return al;
    }

    public static void main(String[] args) {
        int[]a = {1, 5, 10, 20, 40, 80};
        int []b = {6, 7, 20, 80, 100};
        int []c = {3, 4, 15, 20, 30, 70, 80, 120};

        System.out.println("Common elements are : "+commonElements(a,b,c));
    }
}
