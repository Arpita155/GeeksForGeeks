package GeeksForGeeks.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimizeSumOfProduct {

    public static long minValue(List<Integer> arr1, List<Integer> arr2) {
        // code here
        long res = 0;
        Collections.sort(arr1);
        Collections.sort(arr2);
        for(int i=0;i<arr1.size();i++){
            res += arr1.get(i)*arr2.get(arr2.size()-1-i);
        }

        return res;
    }

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>(Arrays.asList(3,1,1));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(6,5,4));

        System.out.println("The result is : "+minValue(l1,l2));    //Output : 23

        // Explanation : After sorting arr1 = 1,1,3 and arr2 = 4,5,6   , Now 1*6 + 1*5 + 3*4 = 6+5+12 = 23.
    }
}
