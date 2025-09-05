package GeeksForGeeks.BasicQustionsOnJava.Array.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class DistictElementInAnArray {

    public static ArrayList<Integer> uniqueSorted(int arr[]) {
        // Your code here
        ArrayList<Integer> element = new ArrayList<>();
        Arrays.sort(arr);
        element.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                element.add(arr[i]);
            }
        }
        return element;
    }

    public static void main(String[] args) {
        int arr[] = {3, 3, 2, 2, 1, 4};
        System.out.println(uniqueSorted(arr));
    }
}
