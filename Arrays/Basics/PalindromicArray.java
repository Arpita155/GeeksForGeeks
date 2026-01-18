package GeeksForGeeks.Arrays.Basics;

public class PalindromicArray {

    public static boolean reverse(int n){
        int rev = 0;
        int temp = n;
        while(n!=0){
            rev = rev*10 +(n%10);
            n/=10;
        }
        if(rev == temp){
            return true;
        }
        return false;
    }
    public static boolean isPalindromicArray(int[] arr) {
        // add code here
        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            boolean value = reverse(element);
            if(value==false){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {111,222,333,44,555};
        System.out.println("Is the array palindrome : "+isPalindromicArray(arr));
    }
}
