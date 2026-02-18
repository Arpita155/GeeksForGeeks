package GeeksForGeeks.Arrays.Medium;

import java.util.ArrayList;

//Q. Given an array of integers arr[]. You have to find the Inversion Count of the array.
//Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].
public class CountInversion {

    public static int inversionCount(int []arr) {
        // Code Here
        int n=arr.length;
        int cnt=0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0;i<n;i++) {
            int l=0, h=al.size()-1;
            while(l<=h) {
                int mid = (l+h)/2;
                if (al.get(mid) <= arr[i]) {
                    l = mid+1;
                } else {
                    h = mid-1;
                }
            }
            cnt += (al.size()-l);
            al.add(l, arr[i]);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[]arr = {2, 4, 1, 3, 5};
        System.out.println("Number of inversion = "+ inversionCount(arr));
    }
}
