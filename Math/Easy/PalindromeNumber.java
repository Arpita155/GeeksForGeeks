package GeeksForGeeks.Math.Easy;

public class PalindromeNumber {

    public static boolean isPalindrome(int n) {
        // code here
        int rev = 0;
        int t = n;
        while(n!=0){
            int rem = n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(t==rev){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 121;
        System.out.println("Is the number palindrome : "+isPalindrome(n));
    }
}
