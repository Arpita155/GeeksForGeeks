package GeeksForGeeks.Matrix.Medium;

import java.util.PriorityQueue;

//Q. Given a matrix mat[][] of size n*n, where each row and column is sorted in non-decreasing order.
// Find the kth smallest element in the matrix.
public class KthSmallestElementUsingPriorityQueue {

    public static int kthSmallest(int[][] mat, int k) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                pq.add(mat[i][j]);
            }
        }
        for(int i=1;i<k;i++)
            pq.poll();
        return pq.peek();
    }

    public static void main(String[] args) {
        int[][]mat = {{16, 28, 60, 64},
                {22, 41, 63, 91},
                {27, 50, 87, 93},
                {36, 78, 87, 94}};
        int k = 3;
        System.out.println("Kth smallest element in the matrix is : "+kthSmallest(mat,k));   // 27
    }
}
