package GeeksForGeeks.LinkedList;

import java.util.LinkedList;

public class ElementInsertionInLinkedList {
    public static LinkedList<Integer> insertion(int []arr) {
        // Your code here
        LinkedList<Integer> list = new LinkedList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }

    public static void main(String[] args) {
        int []a = {1,2,3,4};
        System.out.println(insertion(a));
    }
}
