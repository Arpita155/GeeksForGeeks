package GeeksForGeeks.LinkedList.Easy;

public class JoinTwoLL {

    public static Node joinTheLists(Node head1, Node head2) {
        // code here

        Node curr1 = head1;
        Node curr2=head2;
        while(curr1.next!=null){
            curr1=curr1.next;
        }
        while(curr2!=null){
            curr1.next=curr2;
            curr2=curr2.next;
            curr1=curr1.next;
        }

        return head1;
    }

    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(15);
        head2.next = new Node(25);
        head2.next.next = new Node(30);
        head2.next.next.next = new Node(45);

        System.out.print("LL1 looks like this : ");
        Node.traversal(head1);
        System.out.print("\nLL2 looks like this : ");
        Node.traversal(head2);

        head1 = joinTheLists(head1,head2);
        System.out.print("\nAfter joining LL looks like this : ");
        Node.traversal(head1);
    }
}
