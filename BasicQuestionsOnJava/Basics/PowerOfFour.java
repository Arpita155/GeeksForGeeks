package GeeksForGeeks.BasicQustionsOnJava.Basics;

import java.util.Scanner;

public class PowerOfFour {

    public static int isPowerOfFour(long n) {
        // Your code here
        boolean flag = false;
        for(int i=0;i<=n;i++){
            long power = (long)Math.pow(4,i);
            if(power == n){
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element :");
        int n = sc.nextInt();   // For : 64
        System.out.println(isPowerOfFour(n));  // As, 64 is the power of 4 , so it return 1.
    }
}
