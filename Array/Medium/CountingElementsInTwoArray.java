package GeeksForGeeks.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

//Q. You are given two unsorted arrays a[] and b[]. Both arrays may contain duplicate elements. For each element in a[],
// your task is to count how many elements in b[] are less than or equal to that element.
public class CountingElementsInTwoArray {

    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        // code here

        Arrays.sort(b);
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            int j=0;
            while(j<b.length && a[i]>=b[j] ){
                j++;
            }
            result.add(j);
        }

        return result;
    }

    public static void main(String[] args) {

        int []a = {4, 8, 7, 5, 1};
        int []b = {4, 48, 3, 0, 1, 1, 5};

        System.out.println(countLessEq(a,b));   // Output : [5, 6, 6, 6, 3]
    }
}
