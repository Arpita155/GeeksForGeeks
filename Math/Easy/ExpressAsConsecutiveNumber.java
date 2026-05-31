package GeeksForGeeks.Math.Easy;

public class ExpressAsConsecutiveNumber {

    public static boolean isSumOfConsecutive(int n) {
        // code here
        return (n & (n - 1)) != 0;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Is it sum of consecutive number : "+isSumOfConsecutive(n));
    }
}
