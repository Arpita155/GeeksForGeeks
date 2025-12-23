package GeeksForGeeks.String.Basics;

import java.util.HashSet;
import java.util.Set;

public class PanagramChecking {

    public static boolean isPanagram(String str) {
        // Your code here
        Set<Character> set = new HashSet<>();
        str = str.toLowerCase();
        for (char c : str.toCharArray())
        {
            if (c >= 'a' && c <= 'z')
            {
                set.add(c);
            }
        }
        return set.size() == 26;
    }


    public static void main(String[] args) {

        String s = "Thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Is the string panagram : "+isPanagram(s));  // output : Is the string panagram : true
    }
}
