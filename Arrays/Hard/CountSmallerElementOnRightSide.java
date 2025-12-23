package GeeksForGeeks.Arrays.Hard;

import java.util.Arrays;
//Q. Given an array arr containing non-negative integers. Count and return an array res where res[i] denotes the number of smaller elements on right side of arr[i].
public class CountSmallerElementOnRightSide {

    public static int[] constructLowerArray(int[] arr) {
        // code here
        int len = arr.length;
        int[] res = new int[len];
        res[len-1]=0;
        for(int i=0;i<len-1;i++){
            int count = 0;
            int ele = arr[i];
            for(int j=i+1;j<len;j++){
                if(ele>arr[j]) count++;
            }
            res[i]=count;
        }
        return res;

    }

    public static void main(String[] args) {

        int[]arr = {12, 1, 2, 3, 0, 11, 4};

        System.out.println(Arrays.toString(constructLowerArray(arr)));  //Output : [6, 1, 1, 1, 0, 1, 0]
    }
}
