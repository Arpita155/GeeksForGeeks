package GeeksForGeeks.Arrays.Medium;

public class MaximumIndex {

    public static int maxIndexDiff(int arr[]) {
        // code here
        int n = arr.length;
        int[]temp = new int[n];
        temp[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            temp[i]=Math.max(arr[i],temp[i+1]);
        }

        int i = 0;
        int j = 0;
        int max = 0;
        while(i<n && j<n){
            if(arr[i]<=temp[j]){
                max = Math.max(max,j-i);
                j++;
            }else{
                i++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[]arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(maxIndexDiff(arr));   // ans : 6    Explanation: In the given array arr[1] < arr[7] satisfying the required condition (arr[i] <= arr[j]) thus giving the maximum difference of j - i which is 7-1 = 6.
    }
}
