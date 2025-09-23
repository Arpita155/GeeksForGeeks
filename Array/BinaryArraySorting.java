package GeeksForGeeks.Arrays;

import java.util.Arrays;

public class BinaryArraySorting {
    public static void binSort(int[] arr) {
        // code here
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            arr[i]=0;
        }
        for(int i=count;i<arr.length;i++){
            arr[i]=1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int []arr = {1, 0, 1, 1, 0};
        binSort(arr);   // output : [0, 0, 1, 1, 1]
    }
}
