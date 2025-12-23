package GeeksForGeeks.String;

import java.util.Scanner;

public class ReversedWord {
    public static String reverseWords(String s) {
        // Code here
        String [] str = s.split("\\.");
        StringBuilder result = new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            if (!str[i].isEmpty()) {
                result.append(str[i]).append(".");
            }
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        System.out.println("The Original word is: "+s);
        System.out.println("The reversed word is : "+reverseWords(s));
    }
}
