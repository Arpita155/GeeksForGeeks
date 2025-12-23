package GeeksForGeeks.String;

// Q. Given two strings txt and pat, return the 0-based index of the first occurrence of the substring pat in txt.
// If pat is not found, return -1.

public class FirstOccuranceOfSubstring {
    public static int firstOccurence(String txt, String pat) {
        // code here
        if(txt.contains(pat)){
            int a = txt.indexOf(pat);
            return a;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        String txt = "GeeksForGeeks";
        String pat = "For";
        System.out.println(firstOccurence(txt,pat));
    }
}
