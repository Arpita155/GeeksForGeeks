package GeeksForGeeks.BasicQustionsOnJava.Array.ArrayList;

import java.util.ArrayList;
public class AllSmallerElementsThanTargetElement {

    // Q. Given an array []arr . Return all the elements which are less than to given element target.
    // Your task is to return an ArrayList to the given function getSmaller() having all smaller elements in order of their occurance.

    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        // write your code here
        ArrayList<Integer> smallElement = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<target){
                smallElement.add(arr[i]);
            }
        }
        return smallElement;
    }
    public static void main(String[] args) {
        int arr[] = {54, 43, 2, 1, 5};
        int x = 7;
        System.out.println(getSmaller(arr,x));
    }
}
