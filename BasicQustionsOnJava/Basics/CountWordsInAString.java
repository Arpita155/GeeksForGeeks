package GeeksForGeeks.BasicQustionsOnJava.Basics;

import java.util.Scanner;

public class CountWordsInAString {

    public static int countWords(String str) {
        // find and return the number of words
        // present in the string
        String[] arr = str.split(" ");
        return arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();   // hii i am arpita
        System.out.println("Length of the string is : "+countWords(s));   // 4
    }
}
