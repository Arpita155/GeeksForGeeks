package GeeksForGeeks.Arrays.Easy;

import java.util.Arrays;

public class MergingTwoUnsortedArrayInSortedOrder {

    public static int[] sortedMerge(int[] arr1, int[] arr2) {
        // code here
        int[] res = new int[arr1.length+arr2.length];
        int k=0;
        for(int i=0;i<arr1.length;i++){
            res[k]=arr1[i];
            k++;
        }
        for(int i=0;i<arr2.length;i++){
            res[k]=arr2[i];
            k++;
        }
        Arrays.sort(res);

        return res;
    }

    public static void main(String[] args) {
        int []arr1 = {10, 5, 15};
        int []arr2 = {20, 3, 2};

        System.out.println(Arrays.toString(sortedMerge(arr1,arr2)));
    }
}
