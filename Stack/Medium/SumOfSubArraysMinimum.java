package GeeksForGeeks.Stack.Medium;

import java.util.Stack;

public class SumOfSubArraysMinimum {

    public static int sumSubMins(int[] arr) {
        // code here

        // --------------Naive Approach-----------
        /*int n = arr.length;
        int sum = 0;

        for(int i=0;i<n;i++){
            int mini = arr[i];
            for(int j=i;j<n;j++){
                mini = Math.min(mini,arr[j]);
                sum += mini;
            }
        }

        return sum;*/


        int n = arr.length;

        long res = 0;



        int[] left = new int[n];

        int[] right = new int[n];



        Stack<Integer> stack = new Stack<>();



        // Previous Less Element

        for(int i = 0; i < n; i++) {

            while(!stack.isEmpty() && arr[stack.peek()] > arr[i])

                stack.pop();



            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();

            stack.push(i);

        }



        stack.clear();



        // Next Less Element

        for(int i = n - 1; i >= 0; i--) {

            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i])

                stack.pop();



            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;

            stack.push(i);

        }



        for(int i = 0; i < n; i++) {

            res += (long) arr[i] * left[i] * right[i];

        }



        return (int) res;
    }

    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4};
        System.out.println("Sum of minimum subArrays = "+sumSubMins(arr));    // 20
    }
}
