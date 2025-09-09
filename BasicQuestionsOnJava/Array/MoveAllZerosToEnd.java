package GeeksForGeeks.BasicQustionsOnJava.Array;

public class MoveAllZerosToEnd {

    public static void pushZerosToEnd(int[] arr) {

        //Q. You are given an array arr[] of non-negative integers.
        // You have to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements.
        // The operation must be performed in place, meaning you should not use extra space for another array.

        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int []arr = {3,5,0,0,4};
        pushZerosToEnd(arr);
    }
}
