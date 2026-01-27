package GeeksForGeeks.Arrays.Medium;

import java.util.HashSet;

public class ProductPair {

    public static boolean isProduct(int[] arr, long x) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        for(int i : arr){
            hs.add(i);
        }
        for(int i : arr){
            if(x%i==0 && hs.contains((int)(x/i))){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int []arr = {10,20,9,40};
        long x = 400;
        System.out.println("Is there any pair possible : "+isProduct(arr,x));
    }
}
