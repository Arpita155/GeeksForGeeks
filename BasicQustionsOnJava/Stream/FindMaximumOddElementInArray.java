package GeeksForGeeks.BasicQustionsOnJava.Stream;

import java.util.Arrays;

public class FindMaximumOddElementInArray {
    public static int filterUsingStreams(int[] arr) {
        // Your code here

        return Arrays.stream(arr).filter(x->x%2!=0).max().getAsInt();

    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        System.out.println("Maximum odd element is : "+filterUsingStreams(arr));
    }
}
