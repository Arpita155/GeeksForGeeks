package GeeksForGeeks.Arrays.Easy;

import java.lang.Math;

public class SumOfFirstNTermsSeries {

    static int sumOfSeries(int n) {
        // code here
        int sum=0;
        while(n>=1){
            sum += Math.pow(n,3);
            n--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfSeries(n));  // 225
    }
}
