package GeeksForGeeks.Arrays.Easy;

import java.util.ArrayList;

public class FirstAndLastIndexOfAnElement {

    public static ArrayList<Integer> firstAndLast(int x, int arr[]) {
        // Code here
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(-1);
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                flag = true;
                al.add(i);
                break;
            }
        }

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==x){
                flag = true;
                al.add(i);
                break;
            }
        }

        if(flag==true){
            return al;
        }

        return al1;
    }

    public static void main(String[] args) {

        int x = 3;
        int[]arr = {1, 3, 3, 4};

        System.out.println(firstAndLast(x,arr));   // [1,2]
    }
}
