package GeeksForGeeks.String.Basics;

public class RemoveChracterFromFirstString {
    static String removeChars(String str1, String str2) {
        // code here
        String str = "";
        for(int i=0;i<str1.length();i++){
            int flag =0;
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    flag =1;
                }
            }
            if(flag ==0){
                str +=str1.charAt(i);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String str1 = "computer";
        String str2= "cat";
        System.out.println(removeChars(str1,str2));
    }
}
