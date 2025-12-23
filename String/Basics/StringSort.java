package GeeksForGeeks.String.Basics;

import java.util.Arrays;

public class StringSort {
    public static String sort(String s) {
        // code here
        char []cArray = s.toCharArray();
        Arrays.sort(cArray);
        return new String(cArray);

    }

    public static void main(String[] args) {
        String str = "edcab";
        System.out.println(sort(str));
    }
}
