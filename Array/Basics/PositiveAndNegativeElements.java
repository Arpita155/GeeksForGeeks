package GeeksForGeeks.Arrays.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PositiveAndNegativeElements {

    public static ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        // code here

        if(arr.size()==0){
            return new ArrayList<>();
        }

        ArrayList<Integer> result = new  ArrayList<>(Collections.nCopies(arr.size(),0));
        int k=0;
        int l=1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=0){
                result.set(k,arr.get(i));
                k+=2;
            }else{
                result.set(l,arr.get(i));
                l+=2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(-1,2,-3,4,-5,6));
        System.out.println(arranged(al));     // [2, -1, 4, -3, 6, -5]
    }
}
