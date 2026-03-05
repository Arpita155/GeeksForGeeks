package GeeksForGeeks.Arrays.Medium;

public class MaxXorSubArrayOfSizeK {

    public static int maxSubArrayXOR(int[] arr, int k) {
        // code here
        int n=arr.length;
        int maxSum=0;
        int xor=0;
        int l=0, r=0, ind=0;

        while(r<n){
            if(ind<k){
                xor^=arr[r];
                ind++;
                r++;
            }else{
                xor^=arr[l];
                l++;
                ind--;
            }if(ind==k){
                maxSum=Math.max(maxSum, xor);
            }

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 1, 1, 3};
        int k = 3;
        System.out.println("Max xor subArray : "+maxSubArrayXOR(arr,k));
    }
}
