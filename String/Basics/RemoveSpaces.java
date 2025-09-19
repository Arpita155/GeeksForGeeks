package GeeksForGeeks.String.Basics;

public class RemoveSpaces {
    public static String modify(String s) {
        // your code here
        String a="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                a+=s.charAt(i);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        String str = "geeks  for geeks";
        System.out.println(modify(str));
    }
}
