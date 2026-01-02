package GeeksForGeeks.Math.Medium;

import java.util.ArrayList;

public class PrimeNumbers {

    public static ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                al.add(i);
            }
        }
        return al;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int M = 1, N = 10;
        System.out.println(primeRange(M,N));
    }
}
