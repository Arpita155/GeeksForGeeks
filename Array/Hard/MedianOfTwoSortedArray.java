package GeeksForGeeks.Arrays.Hard;

import java.util.Arrays;

//Q. Given two sorted arrays a[] and b[], find and return the median of the combined array after merging them into a single sorted array.
public class MedianOfTwoSortedArray {

    public static double medianOf2(int a[], int b[]) {
        // Code Here
        double res = 0;
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
            res = (double)(temp[n/2]+temp[(n-1)/2])/2;
        }

        if(n%2 != 0){
            res = temp[n/2];
        }

        return (double)res;
    }

    public static void main(String[] args) {

        int []a = {2, 3, 5, 8};
        int []b = {10, 12, 14, 16, 18, 20};

        System.out.println(medianOf2(a,b));   // 11.0
    }
}
