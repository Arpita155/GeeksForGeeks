package GeeksForGeeks.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TwoLinkedListSameOrNot {
    public static boolean areEqual(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {
        // Your code here
        return ll1.equals(ll2);
    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(1,2,3,4));
        System.out.println(areEqual(l1,l2));
    }
}
