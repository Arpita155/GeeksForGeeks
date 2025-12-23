package GeeksForGeeks.Arrays.Easy;

import java.util.ArrayList;

//Q. Given an unsorted array arr. Find all the star elements in the array.
// Star elements are those elements that are strictly greater than all the elements on its right side.
public class StarElement {

    public static ArrayList<Integer> getStar(int[] arr) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        int max = 0;
        for(int i=arr.length-1; i>=0; i--){
            if(max<arr[i]){
                max = arr[i];
                list.add(0,max);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        int []arr = {1, 6, 5, 4, 7, 8, 4, 3, 2, 1};
        System.out.println(getStar(arr));   // Output : [8, 4, 3, 2, 1]
    }
}
