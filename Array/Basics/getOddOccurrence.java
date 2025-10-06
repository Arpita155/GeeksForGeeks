import java.util.*;

public class Prac1 {

    public static int getOddOccurrence(int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int i = 0;
        while (i < n){
            int count = 1;
            while (i + 1 < n && arr[i] == arr[i + 1]){
                count += 1;
                i += 1;
            }
            if (count % 2 == 1)
                return arr[i];
            i += 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {1, 2, 3, 2, 3, 1, 3};
        System.out.println(getOddOccurrence(arr));   // output --> 3.     Because 3 Occurred 3(odd) times.
    }
}


