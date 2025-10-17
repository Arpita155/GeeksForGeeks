package GeeksForGeeks.Arrays.Basics;

import java.util.Arrays;

public class FirstNFibonacciSeries {

    // Q. Given a number n, return an array containing the first n Fibonacci numbers.
    //Note: The first two numbers of the series are 0 and 1.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int []arr = new int[n];
        arr[0]=0;

        if(n > 1){
            arr[1]=1;
        }


        for(int i = 2; i < n; i++){
            arr[i]=arr[i-2]+arr[i-1];
        }

        return arr;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(fibonacciNumbers(n)));  // output : For N=5 output is [0, 1, 1, 2, 3].
    }
}
