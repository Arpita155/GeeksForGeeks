package GeeksForGeeks.Stack.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class InsertElementAtTheBottomOfTheStack {

    public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        s.push(x);
        while(!st.isEmpty()){
            al.add(st.pop());
        }
        Collections.reverse(al);
        for(int i=0;i<al.size();i++){
            s.push(al.get(i));
        }
        return s;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        System.out.println("Before inserting stack looks like this : "+st);

        System.out.println("After inserting element stack looks like this : "+insertAtBottom(st,2));
    }
}
