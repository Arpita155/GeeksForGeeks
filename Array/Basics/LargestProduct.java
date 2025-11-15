package GeeksForGeeks.Arrays.Basics;

public class LargestProduct {

    public static int findMaxProduct(int[] arr, int k) {

        int  max = 0;
        for(int i=0; i<arr.length; i++){
            int j=i, multi = 1, c = 0;
            while(j<arr.length&&c<k){
                multi*=arr[j++];
                c++;
            }
            if(c==k){
                max = Math.max(max, multi);
            }


        }
        return max;

    }

    public static void main(String[] args) {

        int []arr = {1, 6, 7, 8};
        int k = 3;
        System.out.println(findMaxProduct(arr,k));    // 336

    }
}
