package GeeksForGeeks.Arrays.Easy;

import java.util.ArrayList;

// Q. You are given an array arr of positive integers. Your task is to find all the leaders in the array.
// An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.

public class ArrayLeaders {

    public static ArrayList<Integer> leaders(int []arr) {
        // code here
        ArrayList<Integer> output = new ArrayList<>();

        int i=0;
        while(i<arr.length){
            boolean flag = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                output.add(arr[i]);
            }
            i++;
        }
        return output;
    }

    public static void main(String[] args) {
        int []arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr));   // [17, 5, 2]
    }
}
