package GeeksForGeeks.Stack.Medium;

import java.util.Arrays;
import java.util.Stack;

public class SmallerOnLeft {

    public static int[] leftSmaller(int[] arr) {

        // Naive approach
//        ArrayList<Integer> al = new ArrayList<>();
//        al.add(-1);
//        for(int i=1;i<arr.length;i++){
//            boolean flag = false;
//            for(int j=i-1;j>=0;j--){
//                if(arr[j]< arr[i]){
//                    flag=true;
//                    al.add(arr[j]);
//                    break;
//                }
//            }
//            if(!flag){
//                al.add(-1);
//            }
//
//        }

        int[]a = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int k = 0;
        for(int i=0;i<arr.length;i++){
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
