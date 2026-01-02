package GeeksForGeeks.Math.Medium;

public class LargestPrimeFactor {

    public static int largestPrimeFactor(int n) {
        // code here
        int ans = 0;
        for(int i=2;i<=Math.sqrt(n);i++){
            while(n%i==0){
                n=n/i;
                ans = i;
            }
        }

        return n>1 ? n:ans;
    }

    public static void main(String[] args) {
        int n = 24;
        System.out.println("Largest prime factor is : "+largestPrimeFactor(n));
        // Output: 3
        //Explanation: The prime factorization of 24 is 23×3. Among the prime factors (2, 3), the largest is 3.
    }
}
