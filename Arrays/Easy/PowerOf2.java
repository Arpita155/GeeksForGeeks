package GeeksForGeeks.Arrays.Easy;

import java.util.Scanner;

// Q. Given a non-negative integer n. You have to check if it is a power of 2 or not.
public class PowerOf2 {

    public static boolean isPowerofTwo(int n) {
        // code here
        for(int i=0;i<n;i++){
            if(Math.pow(2,i)==n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        System.out.println(isPowerofTwo(n));
    }
}
