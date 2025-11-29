package GeeksForGeeks.Arrays.Medium;
//Q. Given an array arr[], find the sum of all the subarrays of the given array.
//Note: It is guaranteed that the total sum will fit within a 32-bit integer range.
public class SumOfSubArrays {

    public static int subArraySum(int[] arr) {
        // code here
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i]*(i+1)*(n-i);

        }
        return sum;
    }

    public static void main(String[] args) {

        int[]arr = {1, 2, 3};
        System.out.println(subArraySum(arr));  // 20    Explanation: All subarray sums are: [1] = 1, [2] = 2, [3] = 3, [1, 2] = 3,
        // [2, 3] = 5, [1, 2, 3] = 6. Thus total sum is 1 + 2 + 3 + 3 + 5 + 6 = 20.
    }
}
