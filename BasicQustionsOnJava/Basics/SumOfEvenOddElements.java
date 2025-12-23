package GeeksForGeeks.BasicQustionsOnJava.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfEvenOddElements {

    public static int[] findSum(int n) {
        // Code here
        int odd = 0;
        int even = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even += i;
            }else{
                odd += i;
            }
        }
        return new int []{odd,even};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");   // For 5
        int n = sc.nextInt();
        System.out.println(Arrays.toString(findSum(n)));   // Output is : [9,6]
    }
}
