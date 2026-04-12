package GeeksForGeeks.Stack.Hard;

import java.util.Stack;

public class LongestValidParenthesis {

    public static int maxLength(String s) {
        // code here

        Stack<Integer> st = new Stack<>();
        int maxLen = 0;
        st.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    maxLen = Math.max(maxLen, i-st.peek());
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String str =  ")()())";  // 4
        System.out.println(maxLength(str));
    }

}
