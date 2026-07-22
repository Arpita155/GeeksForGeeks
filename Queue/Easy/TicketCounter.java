package GeeksForGeeks.Queue.Easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class TicketCounter {

    public static int distributeTicket(int N, int k) {
        // code here
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=1;i<=N;i++){
            q.add(i);
        }
        while(q.size()>1){
            for(int i=0;i<k && q.size()>1 ; i++){
                q.removeFirst();
            }
            for(int i=0;i<k && q.size()>1 ; i++){
                q.removeLast();
            }
        }
        return q.remove();
    }

    public static void main(String[] args) {
        System.out.println(distributeTicket(9,3));  // 6
        // ==== OUTPUT =====
        //Input: n = 9, k = 3
        //Output: 6
        //Explanation:
        //Starting queue will like [1, 2, 3, 4, 5, 6, 7, 8, 9]. After the first distribution queue will look like [4, 5, 6, 7, 8, 9].
        //And after the second distribution queue will look like [4, 5, 6]. The last person to get the ticket will be 6.
    }
}
