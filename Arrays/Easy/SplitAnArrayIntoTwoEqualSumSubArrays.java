package GeeksForGeeks.Arrays.Easy;

//Q. Given an array of integers arr, return true if it is possible to split it in two subarrays (without reordering the elements),
// such that the sum of the two subarrays are equal. If it is not possible then return false.

public class SplitAnArrayIntoTwoEqualSumSubArrays {

    public static boolean canSplit(int []arr) {
        // code here

        int l = 0;
        int r = arr.length-1;
        int lsum = 0;
        int rsum = 0;
        while(l <= r){
            if(lsum <= rsum){
                lsum += arr[l];
                l++;
            }else{
                rsum += arr[r];
                r--;
            }
        }

        if(lsum == rsum){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 5};
        System.out.println("Can we split the array into two equal subArray : "+canSplit(arr));   // true

        int[] arr1 = {1, 2, 3, 4, 5, 1};
        System.out.println("Can we split the array into two equal subArray : "+canSplit(arr1));   // false
    }
}
