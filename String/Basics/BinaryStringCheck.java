package GeeksForGeeks.String.Basics;

public class BinaryStringCheck {
    public static boolean isBinary(String s) {
        // Your code here
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0' | s.charAt(i)=='1')
                c++;
        }
        if(c==s.length())
            return true;

        return false;
    }

    public static void main(String[] args) {
        String str = "101";
        System.out.println(isBinary(str));
    }
}
