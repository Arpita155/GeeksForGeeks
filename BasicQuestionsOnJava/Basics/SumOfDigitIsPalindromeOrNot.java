package GeeksForGeeks.Arrays.Basics;

import java.util.Scanner;

public class SumOfDigitIsPalindromeOrNot {

    public static boolean isDigitSumPalindrome(int n) {
        // code here
        int sum =0;
        int rev = 0;
        while(n!=0){
            int d = n%10;
            sum +=d;
            n/=10;
        }
        int temp=sum;
        while(sum!=0){
            int rem = sum%10;
            rev = rev*10+rem;
            sum/=10;
        }
        if(temp==rev){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();    // For 56
        System.out.println("Is the digit sum palindrome : "+isDigitSumPalindrome(n));   // For 56 the output is true.
    }
}
