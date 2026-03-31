package GeeksForGeeks.Stack.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class DeleteMidOfAStack {

    public static void deleteMid(Stack<Integer> s) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        while(!s.isEmpty()){
            int a = s.pop();
            al.add(a);
        }

        int n = 0;
        if(al.size()%2==0){
            n = (al.size()/2)-1;
        }else{
            n = (al.size()/2);
        }
        Collections.reverse(al);
        for(int i=0;i<al.size();i++){
            if(i==n){
                continue;
            }
            s.push(al.get(i));
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Before deleting mid stack is : "+st);

        deleteMid(st);
        System.out.println("After deleting stack is : "+st);
    }
}
