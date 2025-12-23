package GeeksForGeeks.Arrays;

import java.util.Arrays;

public class SmallerAndLargerOfTarget {
    public static int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int less =0;
        int more = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=target){
                less++;
            }
            if(arr[i]>=target){
                more++;
            }
        }
        return new int[]{less,more};
    }

    public static void main(String[] args) {
        int []a = {1, 2, 8, 10, 11, 12, 19};
        int target = 0;
        System.out.println(Arrays.toString(getMoreAndLess(a, target)));
    }
}
