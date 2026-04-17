package GeeksForGeeks.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumNeighboursInAnArrayList {

    public static ArrayList<Integer> maxNeighbour(ArrayList<Integer> arr) {
        // Your code here
        if(arr.size()==1){
            return arr;
        }
        ArrayList<Integer> al = new ArrayList<>();
        int k = 0;
        for(int i=0;i<arr.size()-1;i++){
            al.add(k,Math.max(arr.get(i),arr.get(i+1)));
            k++;
        }

        return al;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println(maxNeighbour(arr));
    }
}
