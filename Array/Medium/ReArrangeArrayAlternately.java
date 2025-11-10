package GeeksForGeeks.Arrays.Medium;

import java.util.Arrays;

public class ReArrangeArrayAlternately {

    public static void rearrange(int []arr) {
        // code here
        Arrays.sort(arr);
        int []temp = new int[arr.length];
        int k=0;
        int l = arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                temp[i]=arr[l--];
            }else{
                temp[i]=arr[k++];
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4, 5, 6};
        rearrange(arr);    // [6, 1, 5, 2, 4, 3]
    }
}
