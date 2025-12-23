package GeeksForGeeks.LinkedList.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class SortLLWhichIsSortedAlternately {

    public static Node sort(Node head) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        Node curr = head;
        while(curr!=null){
            al.add(curr.data);
            curr=curr.next;
        }
        Collections.sort(al);
        curr=head;
        int i = 0;
        while(curr!=null){
            curr.data=al.get(i);
            curr=curr.next;
            i++;
        }

        head.data=al.get(0);
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(20);
        head.next.next = new Node(3);
        head.next.next.next = new Node(14);

        System.out.print("Before sorting : ");
        Node.traversal(head);

        head=sort(head);

        System.out.print("\nAfter sorting : ");
        Node.traversal(head);
    }
}
