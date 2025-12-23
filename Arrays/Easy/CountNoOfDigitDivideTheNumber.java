package GeeksForGeeks.Arrays.Easy;

import java.util.Scanner;

public class CountNoOfDigitDivideTheNumber {

    public static int evenlyDivides(int n) {
        // code here
        int temp = n;
        int count = 0;
        while(n!=0){
            int rem = n%10;
            if(rem != 0 && temp%rem==0){
                count++;
            }
            n/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");   // For 39
        int n = sc.nextInt();
        System.out.println(evenlyDivides(n));       // Output : For 39 output is 1.
    }
}
