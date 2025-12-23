package GeeksForGeeks.Arrays;

import java.util.Arrays;

public class WaveArray {
    public static int[] sortInWave(int []arr) {
        // code here
        for(int i=0;i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(sortInWave(arr)));    // Output: [2, 1, 4, 3, 5]
    }
}
