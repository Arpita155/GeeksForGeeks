package GeeksForGeeks.Arrays.Easy;

import java.util.Arrays;

public class MinSumFormedByDigits {

    public static long minSum(int arr[], int n) {
        // Your code goes here
        long n1 = 0l;
        long n2 = 0l;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i%2==0){
                n1 = n1*10 + arr[i];
            }else{
                n2 = n2*10 +arr[i];
            }
        }

        return n1+n2;
    }

    public static void main(String[] args) {
        int n = 6;
        int []arr = {6, 8, 4, 5, 2, 3};
        System.out.println("Minimum sum formed by the digit of the number is : "+minSum(arr,n));
    }
}
