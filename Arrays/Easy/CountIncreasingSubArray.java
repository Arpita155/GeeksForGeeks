package GeeksForGeeks.Arrays.Easy;

public class CountIncreasingSubArray {

    public static int countIncreasing(int[] arr) {
        // code here
        int ans = 0;
        int count = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                count++;
                ans += count;
            }else{
                count = 0;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[]arr = {1, 4, 5, 3, 7, 9};
        System.out.println("Number od possible subArrays are : "+countIncreasing(arr));    // Output: 6
//        Explanation: The strictly increasing subArrays are: [1, 4], [1, 4, 5], [4, 5], [3, 7], [3, 7, 9], [7, 9]
    }
}
