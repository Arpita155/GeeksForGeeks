package GeeksForGeeks.BasicQustionsOnJava.Array;
import java.util.*;
public class ReturnDuplicateElements {

    public static ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> element = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                element.add(arr[i]);
            }
        }
        return element;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 3};
        System.out.println(findDuplicates(arr));
    }
}
