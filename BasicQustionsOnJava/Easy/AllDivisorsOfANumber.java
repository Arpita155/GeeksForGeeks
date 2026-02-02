package GeeksForGeeks.BasicQustionsOnJava.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class AllDivisorsOfANumber {

    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                arr.add(i);
                if(i!=n/i){
                    arr.add(n/i);
                }
            }
        }
        Collections.sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        print_divisors(20);
    }
}
