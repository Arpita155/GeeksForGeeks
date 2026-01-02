package GeeksForGeeks.Arrays.Basics;

import java.util.ArrayList;

public class EvenOddSum {

    public static ArrayList<Integer> evenOddSum(int N, int []arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        int odd = 0;
        int even = 0;
        for(int i=0;i<N;i++){
            if(i%2==0){
                even += arr[i];
            }else{
                odd += arr[i];
            }
        }
        al.add(even);
        al.add(odd);

        return al;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(evenOddSum(5,arr));
    }
}
