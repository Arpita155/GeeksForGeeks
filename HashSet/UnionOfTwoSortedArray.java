package GeeksForGeeks.HashSet;
import java.util.*;
public class UnionOfTwoSortedArray {

    // Q. Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
    //Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> element = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();
        for(int i : a){
            set.add(i);
        }
        for(int i : b){
            set.add(i);
        }
        element.addAll(set);
        Collections.sort(element);
        return element;
    }

    public static void main(String[] args) {
        int []a = {1, 2, 3, 4, 5};
        int []b = {1, 2, 3, 6, 7};
        System.out.println(findUnion(a,b));
    }
}
