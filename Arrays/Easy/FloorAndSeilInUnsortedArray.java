package GeeksForGeeks.Arrays.Easy;

import java.util.Arrays;

public class FloorAndSeilInUnsortedArray {

    public static int[] getFloorAndCeil(int x, int[] arr) {
        // code here

        int floor=-1;
        int ceil=-1;
        for(int num:arr){
            if(num<=x && (floor==-1||num>floor)){
                floor=num;
            }
            if(num>=x && (ceil==-1||num<ceil)){
                ceil=num;
            }
        }
        return new int[]{floor,ceil};
    }

    public static void main(String[] args) {
        int x = 7;
        int[]arr = {5, 6, 8, 9, 6, 5, 5, 6};
        System.out.println(Arrays.toString(getFloorAndCeil(x,arr)));
    }
}
