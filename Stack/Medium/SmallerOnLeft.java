package GeeksForGeeks.Stack.Medium;

import java.util.Arrays;
import java.util.Stack;

public class SmallerOnLeft {

    public static int[] leftSmaller(int[] arr) {
        // code here
        int[]a = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int k = 0;
        st.push(arr[0]);
        a[k++]=-1;
        for(int i=1;i<arr.length;i++){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                a[k++]=-1;

            }else{
                a[k++]=st.peek();
            }
            st.push(arr[i]);
        }

        return a;
    }

    public static void main(String[] args) {
        int[]arr = {1, 5, 0, 3, 4, 5};
        System.out.println(Arrays.toString(leftSmaller(arr)));  // [-1, 1, -1, 0, 3, 4]
    }
}
