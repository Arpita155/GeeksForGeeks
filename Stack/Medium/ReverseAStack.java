package GeeksForGeeks.Stack.Medium;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseAStack {

    public static void reverseStack(Stack<Integer> st) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        while(!st.isEmpty()){
            al.add(st.pop());
        }

        for(int i=0;i<al.size();i++){
            st.push(al.get(i));
        }

        System.out.println(st);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Original stack : "+st);   // [10, 20, 30, 40, 50]
        System.out.print("After reversing the stack : ");
        reverseStack(st);   // [50, 40, 30, 20, 10]
    }
}
