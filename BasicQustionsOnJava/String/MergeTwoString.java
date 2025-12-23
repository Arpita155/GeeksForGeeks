package GeeksForGeeks.BasicQustionsOnJava.String;

public class MergeTwoString {

    public static String merge(String S1, String S2) {
        // code here
        String str = "";
        int l1 = S1.length();
        int l2 = S2.length();
        int i = 0;
        while(i < l1 && i < l2){
            str += S1.charAt(i);
            str += S2.charAt(i);
            i++;
        }

        while(i < l1){
            str += S1.charAt(i);
            i++;
        }
        while(i < l2){
            str += S2.charAt(i);
            i++;
        }
        return str;
    }

    public static void main(String[] args) {
        String S1 = "Hello";
        String S2 = "Bye";
        System.out.println(merge(S1,S2));   // HBeylelo
    }
}
