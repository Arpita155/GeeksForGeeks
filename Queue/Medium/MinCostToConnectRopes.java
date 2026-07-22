package GeeksForGeeks.Queue.Medium;

import java.util.PriorityQueue;

// Q .
public class MinCostToConnectRopes {

    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();   // PriorityQueue stores elements using min heap internally .

        for(int i : arr){
            pq.add(i);
        }
        int cost = 0;
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();

            int sum = first + second;
            cost += sum;

            pq.add(sum);
        }

        return cost;
    }

    public static void main(String[] args) {
        int[]ropes = { 4,3,2,6};

        System.out.println(minCost(ropes));   // 29
        // ==== OUTPUT ====
        //Input: arr[] = [4, 3, 2, 6]
        //Output: 29
        //Explanation: First connect 2 and 3 to get [4, 5, 6] with a cost of 5, then connect 4 and 5 to get [9, 6] with a cost
        // of 9, and finally connect 9 and 6 to get one rope with a cost of 15, giving a total minimum cost of 29.
        // Any other order, such as connecting 4 and 6 first, results in a higher total cost of 38.
    }
}
