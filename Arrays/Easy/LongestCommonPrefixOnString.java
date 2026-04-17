package GeeksForGeeks.Arrays.Easy;

public class LongestCommonPrefixOnString {

    public static String longestCommonPrefix(String arr[]) {
        // code here
        String pre = "";
        for(int i=0;i<arr[0].length();i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j].charAt(i)==arr[0].charAt(i)) continue;
                return pre;
            }
            pre += arr[0].charAt(i);
        }

        return pre;
    }

    public static void main(String[] args) {
        String []str  = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println("Longest common prefix is : "+longestCommonPrefix(str));   // Longest common prefix is : gee
    }
}
