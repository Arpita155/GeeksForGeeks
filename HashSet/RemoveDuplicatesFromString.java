package GeeksForGeeks.HashSet;
import java.util.HashSet;

// Q. Remove Duplicate elements from a string.

public class RemoveDuplicatesFromString {
    public static String removeDuplicates(String s) {
        HashSet<Character>set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "arpita";
        System.out.println(removeDuplicates(str));
    }
}
