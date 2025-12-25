package GeeksForGeeks.Arrays.Easy;

import java.util.HashSet;

//Q. Given two unsorted integer arrays a[] and b[] each consisting of distinct elements, the task is to return the
// count of elements in the intersection (or common elements) of the two arrays.

public class IntersectionOfArrays {

    public static int intersectSize(int a[], int b[]) {
        // Your code here

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        int count = 0;
        for(int j=0;j<b.length;j++){
            if(hs.contains(b[j])){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int []a = {89, 24, 75, 11, 23};
        int []b = {89, 2, 4};

        System.out.print("No. of intersect Element : "+intersectSize(a,b));
    }
}
