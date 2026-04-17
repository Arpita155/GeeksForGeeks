package GeeksForGeeks.String.Basics;

public class AnagramPalindrome {

    public static boolean canFormPalindrome(String s) {
        // code here
        int odd = 0;
        int[]arr = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }
        for(int i : arr){
            if(i%2!=0){
                odd++;
                if(odd > 1) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "geeksogeeks";    // true
//        String str = "geeksforgeeks";    // false
        
        System.out.println("Is the string anagram palindrome : "+canFormPalindrome(str));
    }
}
