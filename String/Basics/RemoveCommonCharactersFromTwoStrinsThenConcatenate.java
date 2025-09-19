package GeeksForGeeks.String.Basics;

public class RemoveCommonCharactersFromTwoStrinsThenConcatenate {
    public static String concatenatedString(String s1, String s2) {
        // code here
        String str="";
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(!s2.contains(String.valueOf(ch))){
                str+=ch;
            }
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(!s1.contains(String.valueOf(ch))){
                str+=ch;
            }
        }
        if(str.length()==0){
            return "-1";
        }
        return str;
    }

    public static void main(String[] args) {
        String s1 = "aacdb";
        String s2 = "gafd";
        System.out.println(concatenatedString(s1,s2));  // output---> cbgf
    }
}
