package GeeksForGeeks.BasicQustionsOnJava.Basics;

public class SumOfPowerOfTheEvenElements {

    public static long sum_of_square_evenNumbers(long n) {
        // Code here
        long sum = 0;
        long k = 2;
        for(int i=0;i<n;i++){
            sum += Math.pow(k,2);
            k+=2;
        }
        return sum;
    }

    public static void main(String[] args) {
        long n = 3;
        System.out.println(sum_of_square_evenNumbers(n));    // 56
    }
}
