package GeeksForGeeks.Arrays.ArrayList;

import java.util.ArrayList;

//Q. You are given an array arr[] of integers, the task is to find the next greater element for each element of the array in order of
// their appearance in the array. Next greater element of an element in the array is the nearest element on the right which is greater than the current element.
//If there does not exist next greater of current element, then next greater element for current element is -1.

public class NextGreaterElement {

    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    flag = true;
                    output.add(arr[j]);
                    break;
                }
            }
            if (flag == false) {
                output.add(-1);
            }
        }
        output.add(-1);
        return output;
    }

    public static void main(String[] args) {
        int []arr = {1, 3, 2, 4};
        System.out.println(nextLargerElement(arr));    // Output: [3, 4, 4, -1]
        // Explanation of the Output : The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, since it doesn't exist, it is -1.
    }
}
