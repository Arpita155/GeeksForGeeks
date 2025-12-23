package GeeksForGeeks.Arrays.Easy;

public class ProductOfAnArray {

    public static long product(long []arr) {
        // your code here

        long ans = 1;
        int MOD = 1000000007;
        for(int i = 0; i < arr.length; i++){
            ans = (ans * arr[i]) % MOD;
        }
        return ans % MOD;
    }

    public static void main(String[] args) {
        long[] arr = {100000, 100000, 100000};

        System.out.println(product(arr));    //Output: 993000007


        //Output: 993000007
        //Explanation:  The product of the array elements is 100000 × 100000 × 100000 = 1000000000000000.
        // Taking modulo 1000000007, the result is 1000000000000000 % 1000000007 = 993000007
    }
}
