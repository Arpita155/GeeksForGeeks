package GeeksForGeeks.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTraversal {
    public static void linkedListTraversal(LinkedList<Integer> list) {
        // Your code here
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1,2,3,4));
        linkedListTraversal(ll);
    }
}
