package GeeksForGeeks.String;

public class RemoveConsecutiveCharacterFromString {
    public static String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) != s.charAt(i-1)) {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String str = "aabbaa";
        System.out.println(removeConsecutiveCharacter(str));
    }
}
