package GeeksForGeeks.Arrays.Easy;

// Q. Given an array of integers arr[], the task is to find the first equilibrium point in the array.
//
//The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists.
public class EquilibriumPoint {

    public static int findEquilibrium(int []arr) {
        // code here
        int n = arr.length;
        int[]psum = new int[n];
        int[]ssum = new int[n];
        for(int i=1;i<n;i++){
            psum[i]=psum[i-1]+arr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            ssum[i] = ssum[i+1]+arr[i+1];
        }
        for(int i=0;i<n;i++){
            if(psum[i]==ssum[i]){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[]arr = {1,2,0,3};
        System.out.println(findEquilibrium(arr));  // ans : 2   Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.
    }
}
