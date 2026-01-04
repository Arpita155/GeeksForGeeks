package GeeksForGeeks.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class MajorityElementMoreThanNDivideBy3Times {

    public static ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<>();
        int n2 = arr.length/3;
        int current=arr[0];
        int v=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == current){
                v++;
            }
            else{
                if(n2<v){
                    list.add(current);
                }
                current = arr[i];
                v=1;
            }
            if(i==arr.length-1){
                if(n2<v){
                    list.add(current);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int []arr = {2, 2, 3, 1, 3, 2, 1, 1};
        System.out.println(findMajority(arr));
    }
}
