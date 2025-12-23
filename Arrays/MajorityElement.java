package GeeksForGeeks.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement {
    public static int moreFrequent(List<Integer> arr, int x, int y) {
        // code here
        int countx = 0;
        int county = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==x){
                countx++;
            }
            if(arr.get(i)==y){
                county++;
            }
        }
        if(countx == county){
            if(x>y){
                return y;
            }else{
                return x;
            }
        }else{
            if(countx>county){
                return x;
            }else{
                return y;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> element = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5);
        int x = 4;
        int y = 5;
        System.out.println("Majority element is : "+moreFrequent(element,x,y));

    }
}
