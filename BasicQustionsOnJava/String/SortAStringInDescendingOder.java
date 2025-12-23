package GeeksForGeeks.BasicQustionsOnJava.String;

import java.util.Arrays;

//Q. Given a string s containing only lowercase alphabets, the task is to sort it in lexicographically-descending order.
public class SortAStringInDescendingOder {

    public static String ReverseSort(String s) {
        // code here
        char []chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        String sb = new StringBuilder(sorted).reverse().toString();
        return sb;
    }

    public static void main(String[] args) {
        String s = "geeks";
        System.out.println(ReverseSort(s));   // skgee
    }
}
