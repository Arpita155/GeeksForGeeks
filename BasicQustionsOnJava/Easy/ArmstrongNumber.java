package GeeksForGeeks.BasicQustionsOnJava.Easy;

import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;
        int temp = n;
        while(n!=0){
            int rem = n%10;
            sum += Math.pow(rem,3);
            n/=10;
        }

        if(sum==temp){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(n+" is the number is armstrong number : "+armstrongNumber(n));
    }
}
