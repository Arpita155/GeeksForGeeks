package GeeksForGeeks.BasicQustionsOnJava.Basics;

// Q. In this problem, a String S is composed of lowercase alphabets and wildcard characters i.e. '?'.
// Here, '?' can be replaced by any of the lowercase alphabets. Now you have to classify the given String on the basis of following rules:
//
//If there are more than 3 consonants together or more than 5 vowels together, the String is considered to be "BAD".
// A String is considered "GOOD" only if it is not “BAD”.

import java.util.Scanner;

public class GoodOrBadString {

    public static int isGoodOrBad(String S) {
        // code here
        int vowel = 0;
        int con = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '?') {
                vowel++;
                con++;
            } else if (S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) == 'o' || S.charAt(i) == 'u') {
                vowel++;
                con = 0;
            } else {
                con++;
                vowel = 0;
            }

            if (vowel > 5 || con > 3) {
                return 0;   // Bad String
            }
        }
        return 1;   // Good String
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();    // aeioup??
        System.out.println(isGoodOrBad(s));
    }
}
