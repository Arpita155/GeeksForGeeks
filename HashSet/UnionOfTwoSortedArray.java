package GeeksForGeeks.HashSet;
import java.util.*;
public class UnionOfTwoSortedArray {

    // Q. Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
    //Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
    public static ArrayList<Integer> findUnion(int []a, int []b) {

        // ----------Brute Force Approach--------
        // T.C = O(m+n) (For Traversing two Arrays) + O(k)(no. of elements ) + O(nlog(n)) (For Sorting)  =====> T.C = O(nlog(n))
        // S.C = O(m+n)(For HashSet) + O(m+n)(For ArrayList)  ===> S.C = O(m+n)

        /*ArrayList<Integer> result = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();
        for(int i : a){
            set.add(i);
        }
        for(int i : b){
            set.add(i);
        }
        result.addAll(set);
        Collections.sort(result);
        return result;
        */

        // -------------Efficient Approach----------- T.C = O(m+n)   S.C= O(m+n)
        int [] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length) {
            if(a[i] <= b[j]) {
                if(k == 0) {
                    c[k] = a[i];
                    k++;
                }
                else if(c[k-1] != a[i]) {
                    c[k] = a[i];
                    k++;
                }
                i++;
            } else {
                if(k == 0) {
                    c[k] = b[j];
                    k++;
                }
                else if(c[k-1] !=  b[j]) {
                    c[k] =  b[j];
                    k++;
                }
                j++;
            }
        }

        while(i < a.length) {
            if(k == 0) {
                c[k] = a[i];
                k++;
            }
            else if(c[k-1] != a[i]) {
                c[k] = a[i];
                k++;
            }
            i++;
        }

        while(j < b.length) {
            if(k == 0) {
                c[k] = b[j];
                k++;
            }
            else if(c[k-1] !=  b[j]) {
                c[k] =  b[j];
                k++;
            }
            j++;
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int p=0;p<k;p++){
            result.add(c[p]);
        }

        System.out.print("After performing union operation on two sorted arrays, result is : ");
        return result;

    }

    public static void main(String[] args) {

        int []a = {1,1,2,2,3,3,4,5,5};
        int []b = {2,3,3,4,4,5,6,6};

        System.out.println(findUnion(a,b));  // After performing union operation on two sorted arrays, result is : [1, 2, 3, 4, 5, 6, 7]
    }
}
