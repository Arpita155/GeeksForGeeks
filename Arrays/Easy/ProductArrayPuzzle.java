package GeeksForGeeks.Arrays.Easy;

import java.util.Arrays;

public class ProductArrayPuzzle {

    public static int[] productExceptSelf(int []arr) {
        // code here
        int[]ans = new int[arr.length];
        int product = 1;
        int flag = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                flag++;
            }else{
                product *= arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(flag == 0){
                ans[i]=(int)(product/arr[i]);
            }else if(flag==1){
                if(arr[i]==0) ans[i]=(int)(product);
                else ans[i]=0;
            }else{
                ans[i]=0;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[]arr = {10, 3, 5, 6, 2};
        System.out.println(Arrays.toString(productExceptSelf(arr)));   // [180, 600, 360, 300, 900]

        int []a = {12,0};
        System.out.println(Arrays.toString(productExceptSelf(a)));   // [0,12]
    }
}
