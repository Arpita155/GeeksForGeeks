package GeeksForGeeks.BasicQustionsOnJava.Basics;

public class TwelveHoursClockAddition {

    public static int clockSum(int num1, int num2) {
        // code here
        int sum = num1+num2;
        if(sum==12){
            return 0;
        }
        if(sum < 12){
            return sum;
        }

        return sum%12;
    }

    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 10;
        System.out.println("After addition time = "+clockSum(n1,n2));
    }
}
