package GeeksForGeeks.String;

public class LastIndexOfACharacterOfString {
    public static int lastIndex(String s) {
        if(s.contains("1")){
            return s.lastIndexOf("1");
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "00001";
        System.out.println(lastIndex(str));
    }
}
