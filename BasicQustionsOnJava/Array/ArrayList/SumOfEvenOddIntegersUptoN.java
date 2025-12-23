package GeeksForGeeks.BasicQustionsOnJava.Array.ArrayList;

import java.util.ArrayList;

public class SumOfEvenOddIntegersUptoN {
    static ArrayList<Integer> getSum(int N) {
        // code here
        ArrayList<Integer> sum = new ArrayList<>();
        int even = 0;
        int odd = 0;
        for(int i=1;i<=N;i++){
            if(i%2==0){
                even+=i;
            }else{
                odd+=i;
            }
        }

        sum.add(even);
        sum.add(odd);
        return sum;
    }

    public static void main(String[] args) {
        SumOfEvenOddIntegersUptoN obj = new SumOfEvenOddIntegersUptoN();
        System.out.println(obj.getSum(6));
    }
}
