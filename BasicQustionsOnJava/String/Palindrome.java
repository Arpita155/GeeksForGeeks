package GeeksForGeeks.BasicQustionsOnJava.String;

import OOP.Polymorphism.QuestionsOfPolymorphism.Q5_Playable_Downloadable.Song;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        // code here
        String reverse = new StringBuilder(s).reverse().toString();
        if(s.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }
}
