package GeeksForGeeks.Matrix;

import java.util.Arrays;
import java.util.HashMap;

public class SortedFrequency {
    public static void freqSorted(int arr[]) {
        // Your Code Here
        Arrays.sort(arr);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for(HashMap.Entry<Integer,Integer> a:hm.entrySet())
        {
            System.out.println(a.getKey()+" : "+a.getValue());
        }
    }

    public static void main(String[] args) {
        int []arr = {3, 3, 2, 2, 1, 4};
        freqSorted(arr);    // output : 1 : 1 , 2 : 2 , 3 : 2 , 4 : 1
    }
}
