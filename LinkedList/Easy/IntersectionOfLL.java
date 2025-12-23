package GeeksForGeeks.LinkedList.Easy;

import java.util.HashSet;

public class IntersectionOfLL {

    public static Node findIntersection(Node head1, Node head2) {
        // add your code here

        Node temp = new Node(0);
        Node curr = temp;
        Node curr1 = head1;
        Node curr2 = head2;
        HashSet<Integer> hs = new HashSet<>();
        while(curr2 != null){
            hs.add(curr2.data);
            curr2=curr2.next;
        }

        while(curr1!=null){
            if(hs.contains(curr1.data)){
                Node t=new Node(curr1.data);
                curr.next=t;
                curr=curr.next;
            }
            curr1=curr1.next;
        }

        return temp.next;
    }

    public static void main(String[] args) {
        Node head1 = new Node(9);
        head1.next = new Node(6);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(2);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(8);
        head2.next.next.next = new Node(6);

        System.out.print("LL1 : ");
        Node.traversal(head1);
        System.out.print("\nLL2 : ");
        Node.traversal(head2);

        Node head=findIntersection(head1,head2);
        System.out.print("\nNew LL : ");
        Node.traversal(head);
    }
}
