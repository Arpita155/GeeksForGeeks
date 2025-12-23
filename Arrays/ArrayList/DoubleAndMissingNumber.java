package GeeksForGeeks.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class DoubleAndMissingNumber {
    public static ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        Arrays.sort(arr);
        ArrayList <Integer> element = new ArrayList<>();
        int duplicate = 0;
        int x = arr.length;
        int sum =arr[0];
        for(int i=1;i<x;i++){
            if(arr[i-1]!=arr[i]){
                sum += arr[i];
            }else{
                duplicate = arr[i];
            }
        }
        int n = arr.length;
        int acctualSum = n*(n+1)/2 ;
        System.out.println("sum = "+sum);
        System.out.println("ac = "+acctualSum);
        int missingNumber = acctualSum-sum;
        element.add(duplicate);
        element.add(missingNumber);
        return element;
    }

    public static void main(String[] args) {
        int []arr = {2,2};
        System.out.println(findTwoElement(arr));   // output: [2, 1]
    }

}
