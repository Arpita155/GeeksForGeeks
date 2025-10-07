package GeeksForGeeks.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CountNumberOfElements {

    public static int getCount(ArrayList<Integer> arr, int num1, int num2) {
        // Your Code goes here.
        int start=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==num1){
                start=i+1;
                break;
            }
        }
        int end=0;
        for(int i=arr.size()-1;i>=0;i--){
            if(arr.get(i)==num2){
                end=i;
                break;
            }
        }
        int count=0;
        for(int i=start; i < end; i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> element = new ArrayList<>(Arrays.asList(4, 2, 1, 10, 6));
        int num1 = 4;
        int num2 = 6;
        System.out.println(getCount(element,num1,num2));   // Output: 3 --> Because in between 4 and 6 there are 3 elements 2,1,10.
    }
}
