package GeeksForGeeks.Math.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeFactors {

    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                al.add(i);
            }
            while(n % i == 0){
                n = n / i;
            }
        }
        if(n > 1){
            al.add(n);
        }

        return al;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Prime Factors are : "+primeFac(n));
    }
}
