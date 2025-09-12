package GeeksForGeeks.String;

import java.util.HashSet;

public class FirstRepeatedConsecutiveCharacter {
    public static String firstRepChar(String s) {
        // code here
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<s.length(); i++) {
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            } else {
                return s.charAt(i) + "";
            }
        }

        return "-1";
    }

    public static void main(String[] args) {
        String s ="geeksforgeeks";
        System.out.println(firstRepChar(s));
    }
}
