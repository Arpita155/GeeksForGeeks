package GeeksForGeeks.Stack.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SortAStack {

    public static void sortStack(Stack<Integer> st) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        while(!st.isEmpty()){
            al.add(st.pop());
        }
        Collections.sort(al);
        for(int i=0;i<al.size();i++){
            st.push(al.get(i));
        }

        System.out.println(al);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(41);
        st.push(3);
        st.push(32);
        st.push(2);
        st.push(11);

        System.out.print("Before sorting, stack looks like this : ");
        System.out.println(st);

        System.out.print("After sorting, stack looks like this : ");
        sortStack(st);
    }
}
