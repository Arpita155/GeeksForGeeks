package GeeksForGeeks.Queue.PriorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargest {

    public static int kthLargest(int arr[], int k) {
        // code here

        // Brute force approach
        /*int n = arr.length;
        k %= n;

        Arrays.sort(arr);
        return arr[n-k];*/


        // ----- Efficient Approach ----
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int[]arr = {3, 5, 4, 2, 9};
        int k = 3;
        System.out.println("Kth largest element is : "+kthLargest(arr,k));
    }
}
