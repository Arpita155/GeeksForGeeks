package GeeksForGeeks.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndSecondSmallest {

    public static ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(arr);
        boolean flag = false;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                flag = true;
                al.add(arr[0]);
                al.add(arr[i]);
                break;
            }
        }

        if(!flag){
            al.add(-1);
        }

        return al;
    }

    public static void main(String[] args) {
        int[] arr = {2,8,4,6,3};

        System.out.println(minAnd2ndMin(arr));   // [2,3]
    }
}
