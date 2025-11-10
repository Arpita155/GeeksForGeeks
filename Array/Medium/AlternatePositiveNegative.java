package GeeksForGeeks.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternatePositiveNegative {

    public static void rearrange(ArrayList<Integer> arr) {
        // code here


        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=0){
                a.add(arr.get(i));
            }else{
                b.add(arr.get(i));
            }
        }
        arr.clear();
        for(int i=0;i<Math.max(a.size(),b.size());i++){
            if(i<a.size()){
                arr.add(a.get(i));
            }
            if(i<b.size()){
                arr.add(b.get(i));
            }
        }

        System.out.println(arr);
    }

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(9, 4, -2, -1, 5, 0, -5, -3, 2));
        rearrange(al);   //Output : [9, -2, 4, -1, 5, -5, 0, -3, 2]
    }
}
