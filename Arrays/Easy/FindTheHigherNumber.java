package GeeksForGeeks.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheHigherNumber {

    public static int findPeakElement(List<Integer> a) {
        // Code here
        int max = a.get(a.size()-1);
        for(int i=0;i<a.size();i++){
            if(a.get(i) > max){
                max = a.get(i);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,5,4,3,2,1));

        System.out.println("Higher number of the list is : "+findPeakElement(l));   // 6

    }
}
