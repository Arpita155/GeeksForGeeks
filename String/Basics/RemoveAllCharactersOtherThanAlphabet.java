package GeeksForGeeks.String.Basics;

public class RemoveAllCharactersOtherThanAlphabet {

    public static String removeSpecialCharacter(String s) {
        // code here
        StringBuilder sb=new StringBuilder("");
        for(int v=0;v<s.length();v++){
            char c=s.charAt(v);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                sb.append(c);
            }
        }
        if(sb.length()==0)
            return "-1";
        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "$Gee*k;s..fo, r'Ge^eks?";
        System.out.println(removeSpecialCharacter(s));
    }
}
