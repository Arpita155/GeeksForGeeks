package GeeksForGeeks.String.Easy;

public class StringReversal {

    public static String reverseString(String s) {
        // code here.
        boolean[] visited = new boolean[256];
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for(int i = n - 1; i >= 0; i--){
            char ch = s.charAt(i);

            if(ch == ' ') continue;

            if(!visited[ch]){
                sb.append(ch);
                visited[ch] = true;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s  = "GEEKS FOR GEEKS";
        System.out.println("After reversal : "+reverseString(s));
    }
}
