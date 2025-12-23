package GeeksForGeeks.Arrays.Easy;

public class MinimumDistanceOfTwoElementInAnArray {

    // Q. You are given an array, arr[]. Find the minimum index based distance between two distinct elements of the array, x and y.
    // Return -1, if either x or y does not exist in the array.

    public static int minDist(int []arr, int x, int y) {
        // code here
        int md=Integer.MAX_VALUE,index1=-1,index2=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                index1=i;
            }
            if(arr[i]==y){
                index2=i;
            }

            if(index1!=-1 && index2!=-1){
                md=Math.min(md,Math.abs(index2-index1));
            }
        }

        if(md==Integer.MAX_VALUE){
            return -1;
        }
        return md;
    }

    public static void main(String[] args) {
        int []arr = {1, 2, 3, 2};
        int x = 1;
        int y = 2;
        System.out.println(minDist(arr,x,y));    // output : 1
    }
}
