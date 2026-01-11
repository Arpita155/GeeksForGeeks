package GeeksForGeeks.Arrays.Easy;

import java.util.Arrays;

public class LeftAndRightIndexOfAnElement {

    public static int[] index(int[]arr, int x){
        int []newArray = new int[2];
        int fIdx = -1;
        int sIdx = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                fIdx=i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--) {
            if (arr[i] == x) {
                sIdx = i;
                break;
            }
        }
        newArray[0]=fIdx;
        newArray[1]=sIdx;

        return newArray;
    }

    public static void main(String[] args) {
        int[]a = {1,2,3,4,5,5,5,6,7,8};
        System.out.println("First and last index are : "+Arrays.toString(index(a,5)));
    }
}
