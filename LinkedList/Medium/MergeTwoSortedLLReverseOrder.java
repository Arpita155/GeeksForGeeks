package GeeksForGeeks.LinkedList.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedLLReverseOrder {

    public static Node mergeResult(Node head1, Node head2) {
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        Node curr1 = head1;
        Node curr2 = head2;
        while(curr1 != null){
            al.add(curr1.data);
            curr1=curr1.next;
        }
        while(curr2 != null){
            al.add(curr2.data);
            curr2=curr2.next;
        }
        Collections.sort(al);
        Node temp = new Node(al.get(al.size()-1));
        Node curr = temp;
        for(int i=al.size()-2;i>=0;i--){
            curr.next = new Node(al.get(i));
            curr = curr.next;
        }

        return temp;
    }

    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(1);
        head2.next = new Node(5);
        head2.next.next = new Node(25);
        head2.next.next.next = new Node(55);

        System.out.print("LL1 looks like this : ");
        Node.traversal(head1);
        System.out.print("\nLL2 looks like this : ");
        Node.traversal(head2);

        Node head =mergeResult(head1,head2);

        System.out.println("\nAfter merging : ");
        Node.traversal(head);
    }
}
