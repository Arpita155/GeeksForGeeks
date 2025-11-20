package GeeksForGeeks.Arrays.Easy;

public class CountSmallerThanTarget {

    public static int smallerThanX(int arr[], int n, int x) {
        // Your code here
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<x){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int N = 5;
        int []arr = {4,5,3,1,2};
        int X = 3;

        System.out.println(smallerThanX(arr,N,X));   // 2

    }
}
