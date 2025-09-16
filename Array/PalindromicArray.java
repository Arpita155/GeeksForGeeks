package GeeksForGeeks.Arrays;

public class PalindromicArray {

    public static boolean isPerfect(int[] arr) {
        // code here
        int n = arr.length;
        int []temp = new int [n];
        int tempv = 0;
        for(int i=n-1;i>=0;i--){
            temp[tempv++] = arr[i];
        }
        for(int i=0;i<n;i++){
            if(arr[i] != temp[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int []a = {1, 2, 3, 2, 1};
        System.out.println("is the given array is a palindromic array : "+isPerfect(a));
    }
}
