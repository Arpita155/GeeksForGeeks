package GeeksForGeeks.Arrays.Medium;

public class FlipToMaximizeOnes {

    public static int maxOnes(int[] arr) {
        // code here
        int ans=0, zero=0, one=0;
        int n = arr.length;
        for (int i=0; i<n; i++){
            if (arr[i] == 0) {
                zero++;
            }
            else {
                zero--;
                one++;
            }
            ans=Math.max(zero, ans);
            if (zero<0) {
                zero=0;
            }
        }
        return ans+one;
    }

    public static void main(String[] args) {
        int[]arr = {1,0,0,1,0};
        System.out.println(maxOnes(arr));   // ans : 4
    }

}
