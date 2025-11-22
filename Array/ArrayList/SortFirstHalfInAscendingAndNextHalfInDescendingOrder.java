package GeeksForGeeks.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortFirstHalfInAscendingAndNextHalfInDescendingOrder {

    public static ArrayList<Integer> customSort(int[] arr) {
        // your code

        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<arr.length/2;i++)
            list1.add(arr[i]);
        Collections.sort(list1);
        for(int i=arr.length/2;i<arr.length;i++)
            list2.add(arr[i]);
        Collections.sort(list2);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<list1.size();i++)
            list.add(list1.get(i));
        for(int i=list2.size()-1;i>=0;i--)
            list.add(list2.get(i));
        return list;
    }

    public static void main(String[] args) {

        int[] arr = {5, 4, 6, 2, 3, 8, 9, 7};
        System.out.println(customSort(arr));   // Output : [2, 4, 5, 6, 9, 8, 7, 3]
    }
}
