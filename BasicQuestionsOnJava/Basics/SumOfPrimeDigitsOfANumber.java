package GeeksForGeeks.BasicQustionsOnJava.Basics;

public class SumOfPrimeDigitsOfANumber {

    static boolean isPrime(int digit){
        return (digit==2 || digit==3 || digit==5 || digit==7 );
    }

    static int primeSum(int n) {
        // code here
        int sum =0;

        while(n != 0){
            int rem = n%10;
            if(isPrime(rem)){
                sum += rem;
            }
            n/=10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 333;
        System.out.println(primeSum(n));   // 9
    }
}
