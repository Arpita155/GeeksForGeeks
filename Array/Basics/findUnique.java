import java.util.*;

public class UniqueElement {

    public static int findUnique(int k, int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;

        if (n > 1 && arr[0] != arr[1]) {
            return arr[0];
        }
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        if (n > 1 && arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = 3;
        int []arr = {6, 2, 5, 2, 2, 6, 6};
        System.out.println(findUnique(k,arr));  // 5
    }
}


