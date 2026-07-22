package GeeksForGeeks.Queue.Medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class StreamFirstNonRepeating {

    public static String firstNonRepeating(String s) {
        // code here

        // ------- Naive Approach ------
        /*String res = "";
        Queue<Character> q = new LinkedList<>();
        int[]freq = new int[26];

        for(char ch : s.toCharArray()){
            q.add(ch);
            freq[ch - 'a']++;

            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                res += '#';
            }else{
                res += q.peek();
            }
        }

        return res;*/

        // ---------- Efficient Approach --------
        int n=s.length();
        if(n==0)
            return "";

        HashMap<Character,Integer> set = new HashMap<>();
        Queue<Character> q= new LinkedList<>();
        StringBuilder ans = new StringBuilder();


        for(int i=0;i<n;i++) {
            char ch=s.charAt(i);
            set.put(ch,set.getOrDefault(ch,0)+1);
            q.add(ch);

            while(!q.isEmpty()&&set.get(q.peek())>1) {
                q.poll();
            }
            if(q.isEmpty()){
                ans.append('#');
            }else{
                ans.append(q.peek());
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "aabc";
        System.out.println(firstNonRepeating(s));   // a#bb
        // === OUTPUT ===
        // Input: s = "aabc"
        //Output: a#bb
        //Explanation:
        //At i=0 ("a"): First non-repeating character is 'a'.
        //At i=1 ("aa"): No non-repeating character, so '#'.
        //At i=2 ("aab"): First non-repeating character is 'b'.
        //At i=3 ("aabc"): Non-repeating characters are 'b' and 'c'; 'b' appeared first, so 'b'.
    }
}
