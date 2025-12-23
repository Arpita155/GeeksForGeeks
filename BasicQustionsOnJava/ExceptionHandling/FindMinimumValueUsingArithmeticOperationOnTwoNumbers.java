package GeeksForGeeks.BasicQustionsOnJava.ExceptionHandling;

import java.util.Scanner;

public class FindMinimumValueUsingArithmeticOperationOnTwoNumbers {

    // Given two integers a and b. Find the minimum value of a $ b where $ is any arithmetic operation like multiply( * ), Divide( / ), Addition( + ), Substraction( - ).
    public int findMin(int a, int b) {
        // Your code here
        int div = 0;
        int mult = a*b;
        int add = a+b;
        int sub = a-b;
        try{
            div = a/b;
        }
        catch(Exception e){

        }
        if(mult <= div && mult <= add && mult <= sub){
            return mult;
        }else if(div <= mult && div <= add && div <= sub){
            return div;
        }else if(add <= mult && add <= div && add <= sub){
            return add;
        }else{
            return sub;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int x = sc.nextInt();
        System.out.println("Enter second Number: ");
        int y = sc.nextInt();

        FindMinimumValueUsingArithmeticOperationOnTwoNumbers obj = new FindMinimumValueUsingArithmeticOperationOnTwoNumbers();
        int result = obj.findMin(x,y);
        System.out.println(result);
    }
}
