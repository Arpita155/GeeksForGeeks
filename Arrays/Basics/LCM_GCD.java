package GeeksForGeeks.Arrays.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class LCM_GCD {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int x =a,y=b;
        int gcd = 0;
        int lcm = 0;
        int temp =0;
        while(b!=0){
            temp = b;
            b=a%b;
            a=temp;
        }
        gcd = a;
        lcm = (x*y)/gcd;
        return new int []{lcm,gcd};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a : ");
        int a = sc.nextInt();   // 5
        System.out.println("enter the value of b : ");
        int b = sc.nextInt();   // 10
        System.out.println(Arrays.toString(lcmAndGcd(a,b)));    // [10,5]
    }
}
