package GeeksForGeeks.BasicQustionsOnJava.Easy;

import java.util.Arrays;
//Q. Given a number N, find the least prime factors for all numbers from 1 to N.
// The least prime factor of an integer X is the smallest prime number that divides it.
public class LeastPrimeFactor {

    public static int[] leastPrimeFactor(int n) {
        // code here
        int [] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    arr[i]=j;
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int n = 6;
        System.out.println(Arrays.toString(leastPrimeFactor(n)));   //Output : [0, 1, 2, 3, 2, 5, 2]
    }
}
