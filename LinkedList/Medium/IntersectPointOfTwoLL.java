package GeeksForGeeks.LinkedList.Medium;

import java.util.HashSet;
import java.util.Set;

public class IntersectPointOfTwoLL {

    public static Node intersectPoint(Node head1, Node head2) {
        // code here
        Set<Node> set = new HashSet<>();

        while (head1 != null) {
            set.add(head1);
            head1 = head1.next;
        }

        while (!set.contains(head2) && head2!=null) {
            head2 = head2.next;
        }
        if(head2==null){
            return null;
        }
        return head2;
    }

    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next=new Node(20);
        head1.next.next=new Node(30);
        head1.next.next.next=new Node(40);

        Node head2 = new Node(15);
        head2.next=new Node(13);
        head2.next.next=new Node(25);

        head2.next.next.next=head1.next.next;
        System.out.print("Your LL1 looks like this : ");
        Node.traversal(head1);
        System.out.print("\nYour LL2 looks like this : ");
        Node.traversal(head2);

        Node head = intersectPoint(head1,head2);
        System.out.println("Intersect point is : "+head.data);


    }
}
