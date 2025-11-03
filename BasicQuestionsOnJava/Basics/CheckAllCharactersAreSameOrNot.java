package GeeksForGeeks.BasicQustionsOnJava.Basics;

import java.util.Scanner;

public class CheckAllCharactersAreSameOrNot {

    public static Boolean check(String s) {
        //your code here
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) != s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();    // For : "gggg"
        System.out.println("Is there are all same characters : "+check(s));  // true
    }
}
