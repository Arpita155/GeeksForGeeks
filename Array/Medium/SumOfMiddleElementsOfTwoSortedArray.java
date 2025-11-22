package GeeksForGeeks.Arrays.Medium;

import java.util.Arrays;

public class SumOfMiddleElementsOfTwoSortedArray {

    public static int sumOfMiddleElements(int[] a, int[] b) {
        // code here
        int sum = 0;
        int k=0;
        int n = a.length + b.length;
        int []temp = new int[n];
        for(int i=0;i<a.length;i++){
            temp[k++]=a[i];
        }
        for(int i=0;i<b.length;i++){
            temp[k++]=b[i];
        }
        Arrays.sort(temp);
        if(n%2==0){
            sum = (temp[n/2]+temp[(n-1)/2]);
        }

        if(n%2 != 0){
            sum = temp[n/2];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[]arr1 = {1, 2, 4, 6, 10};
        int[]arr2 = {4, 5, 6, 9, 12};

        System.out.println(sumOfMiddleElements(arr1,arr2));  // 11
    }
}
