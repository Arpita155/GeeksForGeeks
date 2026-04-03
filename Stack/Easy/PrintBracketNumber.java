package GeeksForGeeks.Stack.Easy;

import java.util.ArrayList;
import java.util.Stack;

public class PrintBracketNumber {

    public static ArrayList<Integer> bracketNumbers(String str) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '('){
                count++;
                al.add(count);
                st.push(count);
            }else if(ch == ')'){
                al.add(st.pop());
            }
        }

        return al;
    }

    public static void main(String[] args) {
        String str = "(aa(bdc))p(dee)";
        System.out.println(bracketNumbers(str));
    }
}
