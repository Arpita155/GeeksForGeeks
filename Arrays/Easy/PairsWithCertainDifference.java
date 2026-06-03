package GeeksForGeeks.Arrays.Easy;

import java.util.Arrays;

public class PairsWithCertainDifference {

    public static int sumDiffPairs(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int res = 0;
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            if(i-1 >= 0 && arr[i]-arr[i-1]<k){
                res += (arr[i]+arr[i-1]);
                i--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[]arr = {3, 5, 10, 15, 17, 12, 9};
        int k = 4;
        System.out.println(sumDiffPairs(arr,k));

        // Input: arr[] = [3, 5, 10, 15, 17, 12, 9], K = 4
        //Output: 62
        //Explanation :
        //The valid disjoint pairs with difference less than K are:
        //(3, 5), (10, 12), (15, 17)
        //The maximum sum obtained from these pairs is:
        //3 + 5 + 10 + 12 + 15 + 17 = 62
        //An alternative pairing could be:
        //(3, 5), (9, 12), (15, 17)
    }
}
