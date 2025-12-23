package GeeksForGeeks.Arrays.Medium;

import java.util.Scanner;

//Q. Given a number n, find the value of n raised to the power of its own reverse.
//Note: The result will always fit into a 32-bit signed integer.
public class PowerOfANumberWithItsReverse {

    public static int reverseExponentiation(int n) {
        // code here
        int result=0;
        int rev = 0;
        int temp =n;
        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n/=10;
        }

        result = (int)Math.pow(temp,rev);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(reverseExponentiation(n));
    }
}
