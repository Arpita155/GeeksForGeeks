package GeeksForGeeks.BasicQustionsOnJava.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueTraversal {

    public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();


        for (int num : arr) {
            pq.add(num);
        }


        return pq;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(insertion(ar));    // [1, 2, 3, 4, 5]
    }
}
