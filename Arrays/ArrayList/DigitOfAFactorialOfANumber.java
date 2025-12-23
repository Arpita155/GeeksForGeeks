package GeeksForGeeks.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

// Q. Extract the digit of factorial of a number.

public class DigitOfAFactorialOfANumber {

    public static ArrayList<Integer> factorial(int n) {
        // code here
        ArrayList<Integer> digits = new ArrayList<>();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        while (fact != 0) {
            int rem = fact % 10;
            digits.add(rem);
            fact /= 10;
        }
        Collections.reverse(digits);
        return digits;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println(factorial(x));  // OUTPUT : [1, 2, 0]
    }
}
