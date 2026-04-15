package GeeksForGeeks.Stack.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElementInCircularArray {

    public static ArrayList<Integer> nextGreater(int[] arr) {
        // code here

        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1; i>=0; i--){
            st.push(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = arr.length - 1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans.add(-1);
            }else{
                ans.add(st.peek());
            }
            st.push(arr[i]);
        }
        Collections.reverse(ans);

        return ans;
    }

    public static void main(String[] args) {
        int[]arr = {1,2,3,4};
        System.out.println("Next Greater element in circular array : "+nextGreater(arr));   // [2,3,4,-1]
    }
}
