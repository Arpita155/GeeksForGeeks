package GeeksForGeeks.BasicQustionsOnJava.Basics;

public class Replace0sWith5s {

    public static int convertFive(int n) {
        // add code here.
        String s = Integer.toString(n);
        s = s.replace('0','5');
        n = Integer.parseInt(s);
        return n;
    }

    public static void main(String[] args) {
        int n = 1004;
        System.out.println(convertFive(n));
    }
}
