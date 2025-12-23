package GeeksForGeeks.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class RotateLinkedListByK {
    public static LinkedList<Integer> rotateByK(LinkedList<Integer> ll, int k) {
        // Your code here
        int n = ll.size();
        if (n == 0) return ll;


        k = k % n;
        if (k == 0) return ll;

        // Rotate k times
        for (int i = 0; i < k; i++) {
            int last = ll.removeLast();
            ll.addFirst(last);
        }
        return ll;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        int k =2;
        System.out.println(rotateByK(ll,k));
    }
}
