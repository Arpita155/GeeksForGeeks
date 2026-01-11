package GeeksForGeeks.Arrays.Medium;

import java.util.ArrayList;

public class NextGreaterElement {

    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    flag = true;
                    al.add(arr[j]);
                    break;
                }
            }
            if(!flag){
                al.add(-1);
            }
        }

        return al;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        System.out.println(nextLargerElement(arr));    // [3, 4, 4, -1]
    }
}
