package GeeksForGeeks.LinkedList.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UnionOfTwoLLInSortedForm {

    public static Node findUnion(Node head1, Node head2) {
        // Add your code here.

        HashSet<Integer> hs = new HashSet<>();
        Node curr1 = head1;
        Node curr2 = head2;
        while(curr1 != null){
            hs.add(curr1.data);
            curr1=curr1.next;
        }
        while(curr2 != null){
            hs.add(curr2.data);
            curr2=curr2.next;
        }
        ArrayList<Integer> al = new ArrayList<>(hs);
        Collections.sort(al);
        Node temp = new Node(al.get(0));
        Node curr = temp;
        for(int i=1;i<al.size();i++){
            curr.next = new Node(al.get(i));
            curr = curr.next;
        }

        return temp;
    }

    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next = new Node(1);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(10);
        head2.next = new Node(2);
        head2.next.next = new Node(13);
        head2.next.next.next = new Node(35);

        System.out.print("LL1 looks like this : ");
        Node.traversal(head1);
        System.out.print("\nLL2 looks like this : ");
        Node.traversal(head2);

        Node head = findUnion(head1,head2);

        System.out.print("\nUnion LL looks like this : ");
        Node.traversal(head);
    }
}
