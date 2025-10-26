package GeeksForGeeks.Arrays.Basics;

import java.util.Arrays;

public class MedianOfAnArray {
    public static double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        int n = arr.length;
        int mid = n/2;
        if(n%2!=0){
            return arr[mid];
        }
        double avg = (double)(arr[mid]+arr[mid-1])/2;
        return avg;

    }

    public static void main(String[] args) {

//        int []arr = {90, 100, 78, 89, 67};
//        System.out.println(findMedian(arr));     // Output : 89.0
        int []arr1 = {56, 67, 30, 79};
        System.out.println(findMedian(arr1));  // Output : 61.5
    }
}
