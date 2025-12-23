package GeeksForGeeks.BasicQustionsOnJava.Array.ArrayList;
import java.util.*;

public class CountOnlyOnce {

    public static int countOnce(int arr[]) {
        // Your code here
        ArrayList<Integer> element = new ArrayList<>();
        Arrays.sort(arr);
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {8, 8, 6, 5, 9, 9, 2};
        System.out.println(countOnce(arr));
    }
}
