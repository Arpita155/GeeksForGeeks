package GeeksForGeeks.BasicQustionsOnJava.Array;
import java.util.Arrays;
public class BuyMaximumToy {

    // You are given an integer array arr[] that denotes the prices of individual toys.
    // You are also given an amount k that is the total money you have. You need to maximize the number of toys you can have with the k amount.
    public static int max_toys(int arr[], int k) {
        // Your code here
        int toysPrice = 0;
        int count = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            toysPrice += arr[i];
            if(toysPrice > k){
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = {3,9,2,5,4,7,1,8};
        int result = max_toys(arr,8);
        System.out.println(result);
    }
}
