import java.util.*;

public class SwapKthElement {

    public static void swapKth(List<Integer> arr, int k) {
        // code here
        // Collections.swap(arr,k-1,arr.size() - k);
        int len=arr.size();
        int st=k-1;
        int ed=len-k;
        int temp=arr.get(st);
        arr.set(st,arr.get(ed));
        arr.set(ed,temp);
        System.out.println(arr);
    }

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        int k = 3;
        swapKth(number,k);   // Output : [1, 2, 6, 4, 5, 3, 7, 8]
    }
}


