package GeeksForGeeks.HashSet;

import java.util.HashSet;

public class DifferenceOfTwoElementsInArrayEqualsToTarget {
    public static boolean findPair(int[] arr, int x) {
        // code here
        if(arr.length==1)
            return false;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(x+arr[i])||set.contains(arr[i]-x))
                return true;
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int []arr = {5, 20, 3, 2, 5, 80};
        int x = 78;
        System.out.println(findPair(arr,x));
    }
}
