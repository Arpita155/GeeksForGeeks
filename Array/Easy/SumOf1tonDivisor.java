package GeeksForGeeks.Arrays.Easy;

//Q. Given a positive integer n, The task is to find the value of Σi F(i)
// where i is from 1 to n and function F(i) is defined as the sum of all divisors of i.

import java.util.Scanner;

public class SumOf1tonDivisor {

    public static long  sumOfDivisors(long n) {
        // code here
        long sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i*(n/i);
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        long n = sc.nextInt();     // For 4

        System.out.println(sumOfDivisors(n));   // Output : 15
    }
}
