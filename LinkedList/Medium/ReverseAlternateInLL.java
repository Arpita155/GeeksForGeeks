package GeeksForGeeks.LinkedList.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAlternateInLL {

    public static void rearrange(Node odd) {
        // add your code here
        if (odd == null || odd.next == null) return;

        ArrayList<Integer> al = new ArrayList<>();
        Node oddPtr = odd;
        Node evenPtr = odd.next;


        Node curr = odd;
        while (curr != null && curr.next != null) {
            Node evenNode = curr.next;
            al.add(evenNode.data);

            curr.next = evenNode.next;
            if (curr.next != null) {
                curr = curr.next;
            }
        }

        Collections.reverse(al);


        for (int val : al) {
            Node n = new Node(val);
            curr.next = n;
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Before Rearranging : ");
        Node.traversal(head);

        rearrange(head);

        System.out.print("\nAfter Rearranging : ");
        Node.traversal(head);

    }
}
