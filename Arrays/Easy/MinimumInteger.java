package GeeksForGeeks.Arrays.Easy;
//Q. You are given an array A of size N. Let us denote S as the sum of all integers present in the array.
// Among all integers present in the array, find the minimum integer X such that S ≤ N*X.
public class MinimumInteger {

    public static int minimumInteger(int N, int[] A) {
        // code here
        long sum =0;
        for(int i=0;i<N;i++){
            sum += A[i];
        }
        int res = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(sum <= (long)N*A[i]){
                res = Math.min(res,A[i]);
            }
        }
        if(res == Integer.MAX_VALUE)return -1;
        return res;
    }

    public static void main(String[] args) {
        int N = 3;
        int[] A = { 1, 3, 2};
        System.out.println(minimumInteger(N,A));   // 2
    }
}
