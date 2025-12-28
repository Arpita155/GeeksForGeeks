package GeeksForGeeks.LinkedList.Medium;

import java.util.Collections;
import java.util.LinkedList;

public class MergeKSortedLL {

    public static Node mergeKLists(Node[] arr) {
        // code here
        LinkedList<Integer> list = new LinkedList<>();

        for (Node node : arr) {
            while (node != null) {
                list.add(node.data);
                node = node.next;
            }
        }

        Node temp = new Node(0);
        Node curr = temp;

        Collections.sort(list);
        for (int val : list) {
            curr.next = new Node(val);
            curr = curr.next;
        }

        return temp.next;
    }

    public static void main(String[] args) {

    }
}
