package GeeksForGeeks.Arrays.Medium;

public class MaxProductSubset {

    public static int findMaxProduct(int[] arr) {
        // code here
        long result = 1;
        int n = arr.length;
        int zeroes = 0;
        int maxi = Integer.MIN_VALUE;
        int mod = 1000000007;
        if(n == 1) return arr[0]%mod;
        if(n == 2){
            if(arr[0] == 0 && arr[1] < 0) return 0;
            else if(arr[0] < 0 && arr[1] == 0) return 0;
        }
        for(int i =0; i<n; i++){
            if(arr[i] != 0){
                result = (result * arr[i])%mod;
                if(arr[i] < 0) maxi = Math.max(maxi, arr[i]);
            }
            else zeroes++;

        }
        if(zeroes == n) return 0;
        if(result < 0) result = result/maxi;
        return (int)result % mod;
    }

    public static void main(String[] args) {
        int[]arr = {-1, 0, -2, 4, 3};
        System.out.println("Maximum subset product is : "+findMaxProduct(arr));
    }
}
